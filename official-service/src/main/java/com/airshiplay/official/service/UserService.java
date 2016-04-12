package com.airshiplay.official.service;

import com.airshiplay.official.mybatis.model.CfgAuthority;
import com.airshiplay.official.mybatis.model.CfgRole;
import com.airshiplay.official.mybatis.model.CfgUser;
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
	public CfgUser createUser(Long regUid, String username, String mobile,
			String email, String regIp, String password)
			throws ServiceException;

	public CfgUser loginUser(String username, String password, String ip)
			throws ServiceException;

	public CfgUser updateUser(CfgUser u) throws ServiceException;

	public CfgUser resetPassword(String username, String password)
			throws ServiceException;

	public CfgRole createRole(String roleName,String desc) throws ServiceException;

	public CfgRole updateRole(Long id,String roleName,String desc) throws ServiceException;

	public CfgAuthority createAuthority(String authorityName,String desc) throws ServiceException;

	public PageInfo<CfgAuthority> getAuthoritys(int pageNum, int pageSize);

	public PageInfo<ServiceUser> getUsers(int pageNum, int pageSize);

	public PageInfo<ServiceRole> getRoles(int pageNum, int pageSize);
}
