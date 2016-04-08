package com.airshiplay.official.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airshiplay.official.mybatis.mapper.CfgAuthorityMapper;
import com.airshiplay.official.mybatis.mapper.CfgRoleMapper;
import com.airshiplay.official.mybatis.mapper.CfgUserMapper;
import com.airshiplay.official.mybatis.model.CfgAuthority;
import com.airshiplay.official.mybatis.model.CfgAuthorityExample;
import com.airshiplay.official.mybatis.model.CfgRole;
import com.airshiplay.official.mybatis.model.CfgRoleExample;
import com.airshiplay.official.mybatis.model.CfgUser;
import com.airshiplay.official.mybatis.model.CfgUserExample;
import com.airshiplay.official.service.UserService;
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
	public CfgUser loginUser(String username, String password, String ip)
			throws ServiceException {
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
				user.setPassword(null);
				user.setSalt(null);
				CfgUser updateUser = new CfgUser();
				updateUser.setId(user.getId());
				updateUser.setLatestLoginTime(new Date());
				updateUser.setLatestLoginIp(ip);
				cfgUserMapper.updateByPrimaryKeySelective(user);
			} else {
				throw new ServiceException("密码错误");
			}
		}
		return user;
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
	public PageInfo<CfgUser> getUsers(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<CfgUser> list = cfgUserMapper
				.selectByExample(new CfgUserExample());
		return new PageInfo<CfgUser>(list);
	}

	@Override
	public PageInfo<CfgRole> getRoles(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<CfgRole>(
				cfgRoleMapper.selectByExample(new CfgRoleExample()));
	}

}
