package com.airshiplay.official.mybatis.model;

import java.util.Date;

public class CfgRole {
    /**
     * database column <code>cfg_role.id</code>
     */
    private Long id;

    /**
     * database column <code>cfg_role.role_name</code>
     */
    private String roleName;

    /**
     * database column <code>cfg_role.create_time</code>
     */
    private Date createTime;

    /**
     * database column <code>cfg_role.role_desc</code>
     */
    private String roleDesc;

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
     * @return role_name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
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

    /**
     * @return role_desc
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * @param roleDesc
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }
}