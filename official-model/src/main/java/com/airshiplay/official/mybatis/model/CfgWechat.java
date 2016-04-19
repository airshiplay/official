package com.airshiplay.official.mybatis.model;

import java.util.Date;

public class CfgWechat {
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
}