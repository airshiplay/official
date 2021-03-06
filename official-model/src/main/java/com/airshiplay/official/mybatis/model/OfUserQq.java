package com.airshiplay.official.mybatis.model;

import java.io.Serializable;
import java.util.Date;

public class OfUserQq implements Serializable {
    /**
     * database column <code>of_user_qq.id</code>
     */
    private Long id;

    /**
     * database column <code>of_user_qq.openid</code>
     */
    private String openid;

    /**
     * database column <code>of_user_qq.access_token</code>
     */
    private String accessToken;

    /**
     * database column <code>of_user_qq.create_time</code>
     */
    private Date createTime;

    /**
     * database column <code>of_user_qq.update_time</code>
     */
    private Date updateTime;

    /**
     * 1、无效；2、生效
     * <p> 
     * database column <code>of_user_qq.status</code>
     */
    private Integer status;

    /**
     * of_user 表ID
     * <p> 
     * database column <code>of_user_qq.uid</code>
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table of_user_qq
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
     * @return openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * @param openid
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * @return access_token
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * @param accessToken
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken == null ? null : accessToken.trim();
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
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取1、无效；2、生效
     *
     * @return status - 1、无效；2、生效
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置1、无效；2、生效
     *
     * @param status 1、无效；2、生效
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取of_user 表ID
     *
     * @return uid - of_user 表ID
     */
    public Long getUid() {
        return uid;
    }

    /**
     * 设置of_user 表ID
     *
     * @param uid of_user 表ID
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_user_qq
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
        OfUserQq other = (OfUserQq) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getAccessToken() == null ? other.getAccessToken() == null : this.getAccessToken().equals(other.getAccessToken()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_user_qq
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_user_qq
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", openid=").append(openid);
        sb.append(", accessToken=").append(accessToken);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", status=").append(status);
        sb.append(", uid=").append(uid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}