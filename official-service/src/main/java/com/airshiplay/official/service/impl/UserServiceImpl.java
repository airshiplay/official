package com.airshiplay.official.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airshiplay.official.mybatis.mapper.CfgAccessTokenMapper;
import com.airshiplay.official.mybatis.mapper.CfgAuthorityMapper;
import com.airshiplay.official.mybatis.mapper.CfgRoleMapper;
import com.airshiplay.official.mybatis.mapper.CfgUserMapper;
import com.airshiplay.official.mybatis.mapper.CfgUserRoleMapper;
import com.airshiplay.official.mybatis.mapper.custom.CustomCfgAuthorityMapper;
import com.airshiplay.official.mybatis.mapper.custom.CustomCfgRoleMapper;
import com.airshiplay.official.mybatis.model.CfgAccessToken;
import com.airshiplay.official.mybatis.model.CfgAccessTokenExample;
import com.airshiplay.official.mybatis.model.CfgAuthority;
import com.airshiplay.official.mybatis.model.CfgAuthorityExample;
import com.airshiplay.official.mybatis.model.CfgRole;
import com.airshiplay.official.mybatis.model.CfgRoleExample;
import com.airshiplay.official.mybatis.model.CfgUser;
import com.airshiplay.official.mybatis.model.CfgUserExample;
import com.airshiplay.official.mybatis.model.CfgUserRole;
import com.airshiplay.official.mybatis.model.CfgUserRoleExample;
import com.airshiplay.official.service.UserService;
import com.airshiplay.official.service.model.ServiceAccessToken;
import com.airshiplay.official.service.model.ServiceRole;
import com.airshiplay.official.service.model.ServiceUser;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.protobuf.ServiceException;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	CfgUserMapper cfgUserMapper;
	@Autowired
	CfgRoleMapper cfgRoleMapper;
	@Autowired
	CfgAuthorityMapper cfgAuthorityMapper;
	@Autowired
	CustomCfgRoleMapper customCfgRoleMapper;
	@Autowired
	CustomCfgAuthorityMapper customCfgAuthorityMapper;
	@Autowired
	CfgUserRoleMapper cfgUserRoleMapper;
	@Autowired
	CfgAccessTokenMapper cfgAccessTokenMapper;

	@Override
	public CfgUser createUser(Long regUid, String username, String mobile,
			String email, String regIp, String password)
			throws ServiceException {

		CfgUserExample example = new CfgUserExample();
		example.createCriteria().andUsernameEqualTo(username);
		if (cfgUserMapper.selectByExample(example).size() > 0) {
			throw new ServiceException("该用户已存在");
		}

		CfgUser u = new CfgUser();
		u.setCreateTime(new Date());
		u.setEmail(email);
		u.setMobile(mobile);
		u.setRegIp(regIp);
		u.setRegUid(regUid);
		u.setUsername(username);

		String salt = RandomStringUtils.randomNumeric(4);
		u.setSalt(salt);
		u.setPassword(org.apache.commons.codec.digest.DigestUtils
				.md5Hex(password + salt));
		cfgUserMapper.insert(u);
		return u;
	}

	@Override
	public ServiceUser loginUser(String username, String password, String ip,
			String display) throws ServiceException {
		CfgUserExample example = new CfgUserExample();
		example.createCriteria().andUsernameEqualTo(username);
		List<CfgUser> list = cfgUserMapper.selectByExample(example);
		CfgUser user = null;
		if (list.isEmpty()) {
			throw new ServiceException("用户不存在");
		} else {
			user = list.get(0);
			if (user.getPassword().equals(
					org.apache.commons.codec.digest.DigestUtils.md5Hex(password
							+ user.getSalt()))) {
				user.setLatestLoginTime(new Date());
				user.setLatestLoginIp(ip);
				cfgUserMapper.updateByPrimaryKeySelective(user);
			} else {
				throw new ServiceException("密码错误");
			}
		}
		user.setPassword(null);
		user.setSalt(null);
		CfgAccessTokenExample exam = new CfgAccessTokenExample();
		exam.createCriteria().andUidEqualTo(user.getId());
		List<CfgAccessToken> listAcc = cfgAccessTokenMapper
				.selectByExample(exam);
		CfgAccessToken acccessToken;
		if (listAcc.isEmpty()) {
			acccessToken = generatorAccessToken(user.getId(), display);
			cfgAccessTokenMapper.insert(acccessToken);
		} else {
			acccessToken = listAcc.get(0);
			if ((acccessToken.getExpires().getTime()) < new Date().getTime()) {
				acccessToken.setStatus(1);
				cfgAccessTokenMapper.updateByPrimaryKey(acccessToken);
				acccessToken = generatorAccessToken(user.getId(), display);
				cfgAccessTokenMapper.insert(acccessToken);
			}
		}
		CfgUserRoleExample examp = new CfgUserRoleExample();
		examp.createCriteria().andUidEqualTo(user.getId()).andStatusEqualTo(2);
		List<CfgRole> roles = customCfgRoleMapper.getRolesByUid(user.getId());
		return new ServiceUser(user).setAccessToken(acccessToken).setRoles(
				roles);
	}

	private CfgAccessToken generatorAccessToken(Long uid, String display) {
		CfgAccessToken acccessToken = new CfgAccessToken();
		acccessToken.setAccessToken(RandomStringUtils.randomAlphanumeric(64));
		acccessToken.setUid(uid);
		java.util.Calendar c = Calendar.getInstance();
		acccessToken.setCreateTime(c.getTime());
		c.add(Calendar.DATE, 7);
		acccessToken.setExpires(c.getTime());
		acccessToken.setDisplay(display);
		acccessToken.setStatus(2);
		return acccessToken;
	}

	@Override
	public CfgUser updateUser(CfgUser u) {
		cfgUserMapper.updateByPrimaryKeySelective(u);
		return null;
	}

	@Override
	public CfgUser resetPassword(String username, String password)
			throws ServiceException {
		CfgUserExample example = new CfgUserExample();
		example.createCriteria().andUsernameEqualTo(username);
		List<CfgUser> list = cfgUserMapper.selectByExample(example);
		CfgUser user = null;
		if (list.isEmpty()) {
			throw new ServiceException("用户不存在");
		} else {
			user = list.get(0);
			String salt = RandomStringUtils.randomNumeric(4);
			user.setSalt(salt);
			user.setPassword(org.apache.commons.codec.digest.DigestUtils
					.md5Hex(password + salt));
			cfgUserMapper.updateByPrimaryKey(user);
		}
		user.setPassword(null);
		user.setSalt(null);
		return user;
	}

	@Override
	public CfgRole createRole(String roleName, String desc)
			throws ServiceException {
		CfgRole record = new CfgRole();
		record.setCreateTime(new Date());
		record.setRoleName(roleName);
		record.setRoleDesc(desc);
		cfgRoleMapper.insert(record);
		return record;
	}

	@Override
	public CfgRole updateRole(Long id, String roleName, String desc)
			throws ServiceException {
		CfgRole role = cfgRoleMapper.selectByPrimaryKey(id);
		role.setRoleDesc(desc);
		role.setRoleName(roleName);
		cfgRoleMapper.updateByPrimaryKey(role);
		return role;
	}

	@Override
	public CfgAuthority createAuthority(String authorityName, String desc)
			throws ServiceException {
		CfgAuthority record = new CfgAuthority();
		record.setCreateTime(new Date());
		record.setAuthorityName(authorityName);
		record.setAuthorityDesc(desc);
		cfgAuthorityMapper.insert(record);
		return record;
	}

	@Override
	public PageInfo<CfgAuthority> getAuthoritys(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<CfgAuthority>(
				cfgAuthorityMapper.selectByExample(new CfgAuthorityExample()));
	}

	@Override
	public PageInfo<ServiceUser> getUsers(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<CfgUser> list = cfgUserMapper
				.selectByExample(new CfgUserExample());
		Page<ServiceUser> result = new Page<ServiceUser>();
		for (CfgUser user : list) {
			ServiceUser ur = new ServiceUser(user);
			List<CfgRole> roles = customCfgRoleMapper.getRolesByUid(user
					.getId());
			ur.setRoles(roles);
			result.add(ur);
		}
		result.setPageNum(((Page<CfgUser>) list).getPageNum());
		result.setPageSize(((Page<CfgUser>) list).getPageSize());
		result.setTotal(((Page<CfgUser>) list).getTotal());
		return new PageInfo<ServiceUser>(result);
	}

	@Override
	public PageInfo<ServiceRole> getRoles(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<CfgRole> list = cfgRoleMapper
				.selectByExample(new CfgRoleExample());
		Page<ServiceRole> result = new Page<ServiceRole>();
		for (CfgRole role : list) {
			ServiceRole ur = new ServiceRole(role);
			List<CfgAuthority> authorities = customCfgAuthorityMapper
					.getAuthoritiesByRoleId(role.getId());
			ur.setAuthorities(authorities);
			result.add(ur);
		}
		result.setPageNum(((Page<CfgRole>) list).getPageNum());
		result.setPageSize(((Page<CfgRole>) list).getPageSize());
		result.setTotal(((Page<CfgRole>) list).getTotal());
		return new PageInfo<ServiceRole>(result);
	}

	@Override
	public List<CfgRole> getRoles() {
		List<CfgRole> list = cfgRoleMapper
				.selectByExample(new CfgRoleExample());
		return list;
	}

	@Override
	public ServiceUser mergeUser(Long id, String username, String email,
			String mobile, String nickname, String password,
			List<CfgRole> roles, String regIp, Long regUid)
			throws ServiceException {
		if (id == null) {
			CfgUserExample example = new CfgUserExample();
			example.createCriteria().andUsernameEqualTo(username);
			List<CfgUser> findUsers = cfgUserMapper.selectByExample(example);
			if (findUsers.isEmpty()) {
				CfgUser record = new CfgUser();
				record.setCreateTime(new Date());
				record.setEmail(email);
				record.setMobile(mobile);
				record.setNickname(nickname);
				record.setUsername(username);
				record.setRegIp(regIp);
				record.setRegUid(regUid);
				String salt = RandomStringUtils.randomNumeric(4);
				record.setSalt(salt);
				record.setPassword(org.apache.commons.codec.digest.DigestUtils
						.md5Hex(password + salt));
				cfgUserMapper.insert(record);
				for (CfgRole role : roles) {
					CfgUserRole cfgUserRole = new CfgUserRole();
					cfgUserRole.setUid(record.getId());
					cfgUserRole.setRoleId(role.getId());
					cfgUserRole.setCreateTime(new Date());
					cfgUserRole.setStatus(2);
					cfgUserRoleMapper.insert(cfgUserRole);
				}
				return new ServiceUser(record).setRoles(roles);
			} else {
				throw new ServiceException("用户名" + username + "已存在");
			}

		} else {
			CfgUser findUsers = cfgUserMapper.selectByPrimaryKey(id);
			if (findUsers == null || !findUsers.getUsername().equals(username)) {
				throw new ServiceException("用户名不存在");
			} else {
				findUsers.setUsername(username);
				findUsers.setEmail(email);
				findUsers.setMobile(mobile);
				findUsers.setNickname(nickname);
				if (!StringUtils.isEmpty(password)) {
					String salt = RandomStringUtils.randomNumeric(4);
					findUsers.setSalt(salt);
					findUsers
							.setPassword(org.apache.commons.codec.digest.DigestUtils
									.md5Hex(password + salt));
				}
				cfgUserMapper.updateByPrimaryKey(findUsers);
				CfgUserRoleExample example = new CfgUserRoleExample();
				example.createCriteria().andUidEqualTo(findUsers.getId());
				// .andStatusEqualTo(2);
				CfgUserRole record = new CfgUserRole();
				record.setStatus(1);
				cfgUserRoleMapper.updateByExampleSelective(record, example);
				for (CfgRole role : roles) {
					CfgUserRole cfgUserRole = new CfgUserRole();
					cfgUserRole.setUid(findUsers.getId());
					cfgUserRole.setRoleId(role.getId());
					cfgUserRole.setCreateTime(new Date());
					cfgUserRole.setStatus(2);
					cfgUserRoleMapper.insert(cfgUserRole);
				}
				return new ServiceUser(findUsers);
			}
		}
	}
}
