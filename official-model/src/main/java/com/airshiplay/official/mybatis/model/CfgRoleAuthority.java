package com.airshiplay.official.mybatis.model;

import java.util.Date;

public class CfgRoleAuthority {
    /**
     * database column <code>cfg_role_authority.id</code>
     */
    private Long id;

    /**
     * database column <code>cfg_role_authority.role_id</code>
     */
    private Long roleId;

    /**
     * database column <code>cfg_role_authority.authority_id</code>
     */
    private Long authorityId;

    /**
     * 1、可访问；2、可授权
     * <p> 
     * database column <code>cfg_role_authority.authority_type</code>
     */
    private Integer authorityType;

    /**
     * database column <code>cfg_role_authority.create_time</code>
     */
    private Date createTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return role_id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * @return authority_id
     */
    public Long getAuthorityId() {
        return authorityId;
    }

    /**
     * @param authorityId
     */
    public void setAuthorityId(Long authorityId) {
        this.authorityId = authorityId;
    }

    /**
     * 获取1、可访问；2、可授权
     *
     * @return authority_type - 1、可访问；2、可授权
     */
    public Integer getAuthorityType() {
        return authorityType;
    }

    /**
     * 设置1、可访问；2、可授权
     *
     * @param authorityType 1、可访问；2、可授权
     */
    public void setAuthorityType(Integer authorityType) {
        this.authorityType = authorityType;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}