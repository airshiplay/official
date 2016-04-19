package com.airshiplay.official.mybatis.model;

import java.io.Serializable;
import java.util.Date;

public class CfgWechat implements Serializable {
    /**
     * cfg_user 表ID
     * <p> 
     * database column <code>cfg_wechat.id</code>
     */
    private Long id;

    /**
     * database column <code>cfg_wechat.openid</code>
     */
    private String openid;

    /**
     * database column <code>cfg_wechat.access_token</code>
     */
    private String accessToken;

    /**
     * database column <code>cfg_wechat.refresh_token</code>
     */
    private String refreshToken;

    /**
     * access_token接口调用凭证超时时间，单位（秒）
     * <p> 
     * database column <code>cfg_wechat.expires_in</code>
     */
    private Integer expiresIn;

    /**
     * database column <code>cfg_wechat.create_time</code>
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cfg_wechat
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取cfg_user 表ID
     *
     * @return id - cfg_user 表ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置cfg_user 表ID
     *
     * @param id cfg_user 表ID
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
     * @return refresh_token
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * @param refreshToken
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken == null ? null : refreshToken.trim();
    }

    /**
     * 获取access_token接口调用凭证超时时间，单位（秒）
     *
     * @return expires_in - access_token接口调用凭证超时时间，单位（秒）
     */
    public Integer getExpiresIn() {
        return expiresIn;
    }

    /**
     * 设置access_token接口调用凭证超时时间，单位（秒）
     *
     * @param expiresIn access_token接口调用凭证超时时间，单位（秒）
     */
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
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
     * This method corresponds to the database table cfg_wechat
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
        CfgWechat other = (CfgWechat) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getAccessToken() == null ? other.getAccessToken() == null : this.getAccessToken().equals(other.getAccessToken()))
            && (this.getRefreshToken() == null ? other.getRefreshToken() == null : this.getRefreshToken().equals(other.getRefreshToken()))
            && (this.getExpiresIn() == null ? other.getExpiresIn() == null : this.getExpiresIn().equals(other.getExpiresIn()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_wechat
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        result = prime * result + ((getRefreshToken() == null) ? 0 : getRefreshToken().hashCode());
        result = prime * result + ((getExpiresIn() == null) ? 0 : getExpiresIn().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_wechat
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
        sb.append(", refreshToken=").append(refreshToken);
        sb.append(", expiresIn=").append(expiresIn);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}