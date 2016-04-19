package com.airshiplay.official.mybatis.model;

import java.util.Date;

public class CfgUser {
    /**
     * database column <code>cfg_user.id</code>
     */
    private Long id;

    /**
     * database column <code>cfg_user.nickname</code>
     */
    private String nickname;

    /**
     * database column <code>cfg_user.username</code>
     */
    private String username;

    /**
     * database column <code>cfg_user.email</code>
     */
    private String email;

    /**
     * database column <code>cfg_user.mobile</code>
     */
    private String mobile;

    /**
     * database column <code>cfg_user.password</code>
     */
    private String password;

    /**
     * database column <code>cfg_user.salt</code>
     */
    private String salt;

    /**
     * 1
     * <p> 
     * database column <code>cfg_user.create_time</code>
     */
    private Date createTime;

    /**
     * database column <code>cfg_user.reg_ip</code>
     */
    private String regIp;

    /**
     * database column <code>cfg_user.reg_uid</code>
     */
    private Long regUid;

    /**
     * database column <code>cfg_user.latest_login_time</code>
     */
    private Date latestLoginTime;

    /**
     * database column <code>cfg_user.latest_login_ip</code>
     */
    private String latestLoginIp;

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
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * @param salt
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * 获取1
     *
     * @return create_time - 1
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置1
     *
     * @param createTime 1
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return reg_ip
     */
    public String getRegIp() {
        return regIp;
    }

    /**
     * @param regIp
     */
    public void setRegIp(String regIp) {
        this.regIp = regIp == null ? null : regIp.trim();
    }

    /**
     * @return reg_uid
     */
    public Long getRegUid() {
        return regUid;
    }

    /**
     * @param regUid
     */
    public void setRegUid(Long regUid) {
        this.regUid = regUid;
    }

    /**
     * @return latest_login_time
     */
    public Date getLatestLoginTime() {
        return latestLoginTime;
    }

    /**
     * @param latestLoginTime
     */
    public void setLatestLoginTime(Date latestLoginTime) {
        this.latestLoginTime = latestLoginTime;
    }

    /**
     * @return latest_login_ip
     */
    public String getLatestLoginIp() {
        return latestLoginIp;
    }

    /**
     * @param latestLoginIp
     */
    public void setLatestLoginIp(String latestLoginIp) {
        this.latestLoginIp = latestLoginIp == null ? null : latestLoginIp.trim();
    }
}