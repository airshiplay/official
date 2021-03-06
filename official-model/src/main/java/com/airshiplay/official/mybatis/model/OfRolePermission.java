package com.airshiplay.official.mybatis.model;

import java.io.Serializable;
import java.util.Date;

public class OfRolePermission implements Serializable {
    /**
     * database column <code>of_role_permission.id</code>
     */
    private Long id;

    /**
     * database column <code>of_role_permission.role_id</code>
     */
    private Long roleId;

    /**
     * database column <code>of_role_permission.authority_id</code>
     */
    private Long authorityId;

    /**
     * 1、可访问；2、可授权
     * <p> 
     * database column <code>of_role_permission.authority_type</code>
     */
    private Integer authorityType;

    /**
     * database column <code>of_role_permission.create_time</code>
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table of_role_permission
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_role_permission
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OfRolePermission other = (OfRolePermission) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getAuthorityId() == null ? other.getAuthorityId() == null : this.getAuthorityId().equals(other.getAuthorityId()))
            && (this.getAuthorityType() == null ? other.getAuthorityType() == null : this.getAuthorityType().equals(other.getAuthorityType()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_role_permission
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getAuthorityId() == null) ? 0 : getAuthorityId().hashCode());
        result = prime * result + ((getAuthorityType() == null) ? 0 : getAuthorityType().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_role_permission
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", authorityId=").append(authorityId);
        sb.append(", authorityType=").append(authorityType);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}