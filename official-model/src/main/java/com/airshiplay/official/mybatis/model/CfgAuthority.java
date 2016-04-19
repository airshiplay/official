package com.airshiplay.official.mybatis.model;

import java.util.Date;

public class CfgAuthority {
    /**
     * database column <code>cfg_authority.id</code>
     */
    private Long id;

    /**
     * database column <code>cfg_authority.patient_id</code>
     */
    private Long patientId;

    /**
     * database column <code>cfg_authority.authority_name</code>
     */
    private String authorityName;

    /**
     * database column <code>cfg_authority.authority_desc</code>
     */
    private String authorityDesc;

    /**
     * database column <code>cfg_authority.create_time</code>
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
     * @return patient_id
     */
    public Long getPatientId() {
        return patientId;
    }

    /**
     * @param patientId
     */
    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    /**
     * @return authority_name
     */
    public String getAuthorityName() {
        return authorityName;
    }

    /**
     * @param authorityName
     */
    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName == null ? null : authorityName.trim();
    }

    /**
     * @return authority_desc
     */
    public String getAuthorityDesc() {
        return authorityDesc;
    }

    /**
     * @param authorityDesc
     */
    public void setAuthorityDesc(String authorityDesc) {
        this.authorityDesc = authorityDesc == null ? null : authorityDesc.trim();
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