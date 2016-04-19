package com.airshiplay.official.mybatis.model;

import java.util.Date;

public class CfgAccessToken {
    /**
     * database column <code>cfg_access_token.access_token</code>
     */
    private String accessToken;

    /**
     * database column <code>cfg_access_token.uid</code>
     */
    private Long uid;

    /**
     * 创建时间
     * <p> 
     * database column <code>cfg_access_token.create_time</code>
     */
    private Date createTime;

    /**
     * 结束时间
     * <p> 
     * database column <code>cfg_access_token.expires</code>
     */
    private Date expires;

    /**
     * database column <code>cfg_access_token.app_id</code>
     */
    private Long appId;

    /**
     * 请求终端类型
     * <p> 
     * database column <code>cfg_access_token.display</code>
     */
    private String display;

    /**
     * 1、无效；2、有效
     * <p> 
     * database column <code>cfg_access_token.status</code>
     */
    private Integer status;

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
     * @return uid
     */
    public Long getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取结束时间
     *
     * @return expires - 结束时间
     */
    public Date getExpires() {
        return expires;
    }

    /**
     * 设置结束时间
     *
     * @param expires 结束时间
     */
    public void setExpires(Date expires) {
        this.expires = expires;
    }

    /**
     * @return app_id
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * @param appId
     */
    public void setAppId(Long appId) {
        this.appId = appId;
    }

    /**
     * 获取请求终端类型
     *
     * @return display - 请求终端类型
     */
    public String getDisplay() {
        return display;
    }

    /**
     * 设置请求终端类型
     *
     * @param display 请求终端类型
     */
    public void setDisplay(String display) {
        this.display = display == null ? null : display.trim();
    }

    /**
     * 获取1、无效；2、有效
     *
     * @return status - 1、无效；2、有效
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置1、无效；2、有效
     *
     * @param status 1、无效；2、有效
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}