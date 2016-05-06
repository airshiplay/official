package com.airshiplay.official.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airshiplay.official.mybatis.mapper.OfAccessTokenMapper;
import com.airshiplay.official.mybatis.mapper.OfAuthorityMapper;
import com.airshiplay.official.mybatis.mapper.OfRoleMapper;
import com.airshiplay.official.mybatis.mapper.OfUserMapper;
import com.airshiplay.official.mybatis.mapper.OfUserRoleMapper;
import com.airshiplay.official.mybatis.mapper.custom.CustomOfAuthorityMapper;
import com.airshiplay.official.mybatis.mapper.custom.CustomOfRoleMapper;
import com.airshiplay.official.mybatis.model.OfAccessToken;
import com.airshiplay.official.mybatis.model.OfAccessTokenExample;
import com.airshiplay.official.mybatis.model.OfAuthority;
import com.airshiplay.official.mybatis.model.OfAuthorityExample;
import com.airshiplay.official.mybatis.model.OfRole;
import com.airshiplay.official.mybatis.model.OfRoleExample;
import com.airshiplay.official.mybatis.model.OfUser;
import com.airshiplay.official.mybatis.model.OfUserExample;
import com.airshiplay.official.mybatis.model.OfUserRole;
import com.airshiplay.official.mybatis.model.OfUserRoleExample;
import com.airshiplay.official.service.UserService;
import com.airshiplay.official.service.model.ServiceRole;
import com.airshiplay.official.service.model.ServiceUser;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.protobuf.ServiceException;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
<<<<<<< HEAD
	OfUserMapper ofUserMapper;
=======
	OfUserMapper OfUserMapper;
>>>>>>> da40ddad45f4884ddb338b4ca2b72658d1839d3f
	@Autowired
	OfRoleMapper OfRoleMapper;
	@Autowired
	OfAuthorityMapper OfAuthorityMapper;
	@Autowired
	CustomOfRoleMapper customOfRoleMapper;
	@Autowired
	CustomOfAuthorityMapper customOfAuthorityMapper;
	@Autowired
	OfUserRoleMapper OfUserRoleMapper;
	@Autowired
	OfAccessTokenMapper OfAccessTokenMapper;

	@Override
	public OfUser createUser(Long regUid, String username, String mobile,
			String email, String regIp, String password)
			throws ServiceException {

		OfUserExample example = new OfUserExample();
		example.createCriteria().andUsernameEqualTo(username);
<<<<<<< HEAD
		if (ofUserMapper.selectByExample(example).size() > 0) {
=======
		if (OfUserMapper.selectByExample(example).size() > 0) {
>>>>>>> da40ddad45f4884ddb338b4ca2b72658d1839d3f
			throw new ServiceException("该用户已存在");
		}

		OfUser u = new OfUser();
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
<<<<<<< HEAD
		ofUserMapper.insert(u);
=======
		OfUserMapper.insert(u);
>>>>>>> da40ddad45f4884ddb338b4ca2b72658d1839d3f
		return u;
	}

	@Override
	public ServiceUser loginUser(String username, String password, String ip,
			String display) throws ServiceException {
		OfUserExample example = new OfUserExample();
		example.createCriteria().andUsernameEqualTo(username);
<<<<<<< HEAD
		List<OfUser> list = ofUserMapper.selectByExample(example);
=======
		List<OfUser> list = OfUserMapper.selectByExample(example);
>>>>>>> da40ddad45f4884ddb338b4ca2b72658d1839d3f
		OfUser user = null;
		if (list.isEmpty()) {
			throw new ServiceException("用户不存在");
		} else {
			user = list.get(0);
			if (user.getPassword().equals(
					org.apache.commons.codec.digest.DigestUtils.md5Hex(password
							+ user.getSalt()))) {
				user.setLatestLoginTime(new Date());
				user.setLatestLoginIp(ip);
<<<<<<< HEAD
				ofUserMapper.updateByPrimaryKeySelective(user);
=======
				OfUserMapper.updateByPrimaryKeySelective(user);
>>>>>>> da40ddad45f4884ddb338b4ca2b72658d1839d3f
			} else {
				throw new ServiceException("密码错误");
			}
		}
		user.setPassword(null);
		user.setSalt(null);
		OfAccessTokenExample exam = new OfAccessTokenExample();
		exam.createCriteria().andUidEqualTo(user.getId());
<<<<<<< HEAD
		List<OfAccessToken> listAcc = OfAccessTokenMapper.selectByExample(exam);
=======
		List<OfAccessToken> listAcc = OfAccessTokenMapper
				.selectByExample(exam);
>>>>>>> da40ddad45f4884ddb338b4ca2b72658d1839d3f
		OfAccessToken acccessToken;
		if (listAcc.isEmpty()) {
			acccessToken = generatorAccessToken(user.getId(), display);
			OfAccessTokenMapper.insert(acccessToken);
		} else {
			acccessToken = listAcc.get(0);
			if ((acccessToken.getExpires().getTime()) < new Date().getTime()) {
				acccessToken.setStatus(1);
				OfAccessTokenMapper.updateByPrimaryKey(acccessToken);
				acccessToken = generatorAccessToken(user.getId(), display);
				OfAccessTokenMapper.insert(acccessToken);
			}
		}
		OfUserRoleExample examp = new OfUserRoleExample();
		examp.createCriteria().andUidEqualTo(user.getId()).andStatusEqualTo(2);
		List<OfRole> roles = customOfRoleMapper.getRolesByUid(user.getId());
		return new ServiceUser(user).setAccessToken(acccessToken).setRoles(
				roles);
	}

	private OfAccessToken generatorAccessToken(Long uid, String display) {
		OfAccessToken acccessToken = new OfAccessToken();
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
	public OfUser updateUser(OfUser u) {
<<<<<<< HEAD
		ofUserMapper.updateByPrimaryKeySelective(u);
=======
		OfUserMapper.updateByPrimaryKeySelective(u);
>>>>>>> da40ddad45f4884ddb338b4ca2b72658d1839d3f
		return null;
	}

	@Override
	public OfUser resetPassword(String username, String password)
			throws ServiceException {
		OfUserExample example = new OfUserExample();
		example.createCriteria().andUsernameEqualTo(username);
<<<<<<< HEAD
		List<OfUser> list = ofUserMapper.selectByExample(example);
=======
		List<OfUser> list = OfUserMapper.selectByExample(example);
>>>>>>> da40ddad45f4884ddb338b4ca2b72658d1839d3f
		OfUser user = null;
		if (list.isEmpty()) {
			throw new ServiceException("用户不存在");
		} else {
			user = list.get(0);
			String salt = RandomStringUtils.randomNumeric(4);
			user.setSalt(salt);
			user.setPassword(org.apache.commons.codec.digest.DigestUtils
					.md5Hex(password + salt));
<<<<<<< HEAD
			ofUserMapper.updateByPrimaryKey(user);
=======
			OfUserMapper.updateByPrimaryKey(user);
>>>>>>> da40ddad45f4884ddb338b4ca2b72658d1839d3f
		}
		user.setPassword(null);
		user.setSalt(null);
		return user;
	}

	@Override
	public OfRole createRole(String roleName, String desc)
			throws ServiceException {
		OfRole record = new OfRole();
		record.setCreateTime(new Date());
		record.setRoleName(roleName);
		record.setRoleDesc(desc);
		OfRoleMapper.insert(record);
		return record;
	}

	@Override
	public OfRole updateRole(Long id, String roleName, String desc)
			throws ServiceException {
		OfRole role = OfRoleMapper.selectByPrimaryKey(id);
		role.setRoleDesc(desc);
		role.setRoleName(roleName);
		OfRoleMapper.updateByPrimaryKey(role);
		return role;
	}

	@Override
	public OfAuthority createAuthority(String authorityName, String desc)
			throws ServiceException {
		OfAuthority record = new OfAuthority();
		record.setCreateTime(new Date());
		record.setAuthorityName(authorityName);
		record.setAuthorityDesc(desc);
		OfAuthorityMapper.insert(record);
		return record;
	}

	@Override
	public PageInfo<OfAuthority> getAuthoritys(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<OfAuthority>(
				OfAuthorityMapper.selectByExample(new OfAuthorityExample()));
	}

	@Override
	public PageInfo<ServiceUser> getUsers(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
<<<<<<< HEAD
		List<OfUser> list = ofUserMapper.selectByExample(new OfUserExample());
		Page<ServiceUser> result = new Page<ServiceUser>();
		for (OfUser user : list) {
			ServiceUser ur = new ServiceUser(user);
			List<OfRole> roles = customOfRoleMapper.getRolesByUid(user.getId());
=======
		List<OfUser> list = OfUserMapper
				.selectByExample(new OfUserExample());
		Page<ServiceUser> result = new Page<ServiceUser>();
		for (OfUser user : list) {
			ServiceUser ur = new ServiceUser(user);
			List<OfRole> roles = customOfRoleMapper.getRolesByUid(user
					.getId());
>>>>>>> da40ddad45f4884ddb338b4ca2b72658d1839d3f
			ur.setRoles(roles);
			result.add(ur);
		}
		result.setPageNum(((Page<OfUser>) list).getPageNum());
		result.setPageSize(((Page<OfUser>) list).getPageSize());
		result.setTotal(((Page<OfUser>) list).getTotal());
		return new PageInfo<ServiceUser>(result);
	}

	@Override
	public PageInfo<ServiceRole> getRoles(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
<<<<<<< HEAD
		List<OfRole> list = OfRoleMapper.selectByExample(new OfRoleExample());
=======
		List<OfRole> list = OfRoleMapper
				.selectByExample(new OfRoleExample());
>>>>>>> da40ddad45f4884ddb338b4ca2b72658d1839d3f
		Page<ServiceRole> result = new Page<ServiceRole>();
		for (OfRole role : list) {
			ServiceRole ur = new ServiceRole(role);
			List<OfAuthority> authorities = customOfAuthorityMapper
					.getAuthoritiesByRoleId(role.getId());
			ur.setAuthorities(authorities);
			result.add(ur);
		}
		result.setPageNum(((Page<OfRole>) list).getPageNum());
		result.setPageSize(((Page<OfRole>) list).getPageSize());
		result.setTotal(((Page<OfRole>) list).getTotal());
		return new PageInfo<ServiceRole>(result);
	}

	@Override
	public List<OfRole> getRoles() {
<<<<<<< HEAD
		List<OfRole> list = OfRoleMapper.selectByExample(new OfRoleExample());
=======
		List<OfRole> list = OfRoleMapper
				.selectByExample(new OfRoleExample());
>>>>>>> da40ddad45f4884ddb338b4ca2b72658d1839d3f
		return list;
	}

	@Override
	public ServiceUser mergeUser(Long id, String username, String email,
			String mobile, String nickname, String password,
			List<OfRole> roles, String regIp, Long regUid)
			throws ServiceException {
		if (id == null) {
			OfUserExample example = new OfUserExample();
			example.createCriteria().andUsernameEqualTo(username);
<<<<<<< HEAD
			List<OfUser> findUsers = ofUserMapper.selectByExample(example);
=======
			List<OfUser> findUsers = OfUserMapper.selectByExample(example);
>>>>>>> da40ddad45f4884ddb338b4ca2b72658d1839d3f
			if (findUsers.isEmpty()) {
				OfUser record = new OfUser();
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
<<<<<<< HEAD
				ofUserMapper.insert(record);
=======
				OfUserMapper.insert(record);
>>>>>>> da40ddad45f4884ddb338b4ca2b72658d1839d3f
				for (OfRole role : roles) {
					OfUserRole OfUserRole = new OfUserRole();
					OfUserRole.setUid(record.getId());
					OfUserRole.setRoleId(role.getId());
					OfUserRole.setCreateTime(new Date());
					OfUserRole.setStatus(2);
					OfUserRoleMapper.insert(OfUserRole);
				}
				return new ServiceUser(record).setRoles(roles);
			} else {
				throw new ServiceException("用户名" + username + "已存在");
			}

		} else {
<<<<<<< HEAD
			OfUser findUsers = ofUserMapper.selectByPrimaryKey(id);
=======
			OfUser findUsers = OfUserMapper.selectByPrimaryKey(id);
>>>>>>> da40ddad45f4884ddb338b4ca2b72658d1839d3f
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
<<<<<<< HEAD
				ofUserMapper.updateByPrimaryKey(findUsers);
=======
				OfUserMapper.updateByPrimaryKey(findUsers);
>>>>>>> da40ddad45f4884ddb338b4ca2b72658d1839d3f
				OfUserRoleExample example = new OfUserRoleExample();
				example.createCriteria().andUidEqualTo(findUsers.getId());
				// .andStatusEqualTo(2);
				OfUserRole record = new OfUserRole();
				record.setStatus(1);
				OfUserRoleMapper.updateByExampleSelective(record, example);
				for (OfRole role : roles) {
					OfUserRole OfUserRole = new OfUserRole();
					OfUserRole.setUid(findUsers.getId());
					OfUserRole.setRoleId(role.getId());
					OfUserRole.setCreateTime(new Date());
					OfUserRole.setStatus(2);
					OfUserRoleMapper.insert(OfUserRole);
				}
				return new ServiceUser(findUsers);
			}
		}
	}

	@Override
	public OfUser findUserByUsername(String username) {
		OfUserExample example = new OfUserExample();
		List<OfUser> list = ofUserMapper.selectByExample(example);
		return list.isEmpty() ? null : list.get(0);
	}
}
