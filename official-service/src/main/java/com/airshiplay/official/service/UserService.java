package com.airshiplay.official.service;

import java.util.List;

import com.airshiplay.official.mybatis.model.OfPermission;
import com.airshiplay.official.mybatis.model.OfRole;
import com.airshiplay.official.mybatis.model.OfUser;
import com.airshiplay.official.service.model.ServiceRole;
import com.airshiplay.official.service.model.ServiceUser;
import com.github.pagehelper.PageInfo;
import com.google.protobuf.ServiceException;

public interface UserService {
	/**
	 * 
	 * @param regUid
	 * @param username
	 * @param mobile
	 * @param email
	 * @param regIp
	 * @param password
	 * @return
	 * @throws ServiceException
	 */
	public OfUser createUser(Long regUid, String username, String mobile,
			String email, String regIp, String password)
			throws ServiceException;

	public ServiceUser loginUser(String username, String password, String ip, String display)
			throws ServiceException;

	public OfUser updateUser(OfUser u) throws ServiceException;

	public OfUser resetPassword(String username, String password)
			throws ServiceException;

	public OfRole createRole(String roleName, String desc)
			throws ServiceException;

	public OfRole updateRole(Long id, String roleName, String desc)
			throws ServiceException;

	public OfPermission createAuthority(String authorityName, String desc)
			throws ServiceException;

	public PageInfo<OfPermission> getAuthoritys(int pageNum, int pageSize);

	public PageInfo<ServiceUser> getUsers(int pageNum, int pageSize);

	public PageInfo<ServiceRole> getRoles(int pageNum, int pageSize);

	public List<OfRole> getRoles();

	public ServiceUser mergeUser(Long id, String username, String email,
			String mobile, String nickname, String password,
			List<OfRole> roles, String ip, Long regUid)
			throws ServiceException;
	public OfUser findUserByUsername(String username);
}
