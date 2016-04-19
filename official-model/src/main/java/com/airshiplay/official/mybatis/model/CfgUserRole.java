package com.airshiplay.official.mybatis.model;

import java.util.Date;

public class CfgUserRole {
    /**
     * database column <code>cfg_user_role.id</code>
     */
    private Long id;

    /**
     * 用户主键
     * <p> 
     * database column <code>cfg_user_role.uid</code>
     */
    private Long uid;

    /**
     * 角色主键
     * <p> 
     * database column <code>cfg_user_role.role_id</code>
     */
    private Long roleId;

    /**
     * 1、失效；2、生效
     * <p> 
     * database column <code>cfg_user_role.status</code>
     */
    private Integer status;

    /**
     * database column <code>cfg_user_role.create_time</code>
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
     * 获取用户主键
     *
     * @return uid - 用户主键
     */
    public Long getUid() {
        return uid;
    }

    /**
     * 设置用户主键
     *
     * @param uid 用户主键
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * 获取角色主键
     *
     * @return role_id - 角色主键
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色主键
     *
     * @param roleId 角色主键
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取1、失效；2、生效
     *
     * @return status - 1、失效；2、生效
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置1、失效；2、生效
     *
     * @param status 1、失效；2、生效
     */
    public void setStatus(Integer status) {
        this.status = status;
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