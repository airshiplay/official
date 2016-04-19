package com.airshiplay.official.mybatis.model;

public class CfgThirdAccount {
    /**
     * database column <code>cfg_third_account.id</code>
     */
    private Long id;

    /**
     * 1、腾讯QQ；2、微信开放平台网站
     * <p> 
     * database column <code>cfg_third_account.app_type</code>
     */
    private Integer appType;

    /**
     * database column <code>cfg_third_account.app_name</code>
     */
    private String appName;

    /**
     * database column <code>cfg_third_account.app_id</code>
     */
    private String appId;

    /**
     * database column <code>cfg_third_account.app_key</code>
     */
    private String appKey;

    /**
     * database column <code>cfg_third_account.app_secret</code>
     */
    private String appSecret;

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
     * 获取1、腾讯QQ；2、微信开放平台网站
     *
     * @return app_type - 1、腾讯QQ；2、微信开放平台网站
     */
    public Integer getAppType() {
        return appType;
    }

    /**
     * 设置1、腾讯QQ；2、微信开放平台网站
     *
     * @param appType 1、腾讯QQ；2、微信开放平台网站
     */
    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    /**
     * @return app_name
     */
    public String getAppName() {
        return appName;
    }

    /**
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    /**
     * @return app_id
     */
    public String getAppId() {
        return appId;
    }

    /**
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * @return app_key
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * @param appKey
     */
    public void setAppKey(String appKey) {
        this.appKey = appKey == null ? null : appKey.trim();
    }

    /**
     * @return app_secret
     */
    public String getAppSecret() {
        return appSecret;
    }

    /**
     * @param appSecret
     */
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret == null ? null : appSecret.trim();
    }
}