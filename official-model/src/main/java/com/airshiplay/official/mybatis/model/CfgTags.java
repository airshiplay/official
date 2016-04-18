package com.airshiplay.official.mybatis.model;

public class CfgTags {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cfg_tags.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cfg_tags.tag_type
     *
     * @mbggenerated
     */
    private Integer tagType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cfg_tags.tag_name
     *
     * @mbggenerated
     */
    private String tagName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cfg_tags.tag_desc
     *
     * @mbggenerated
     */
    private String tagDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cfg_tags.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cfg_tags.id
     *
     * @return the value of cfg_tags.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cfg_tags.id
     *
     * @param id the value for cfg_tags.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cfg_tags.tag_type
     *
     * @return the value of cfg_tags.tag_type
     *
     * @mbggenerated
     */
    public Integer getTagType() {
        return tagType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cfg_tags.tag_type
     *
     * @param tagType the value for cfg_tags.tag_type
     *
     * @mbggenerated
     */
    public void setTagType(Integer tagType) {
        this.tagType = tagType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cfg_tags.tag_name
     *
     * @return the value of cfg_tags.tag_name
     *
     * @mbggenerated
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cfg_tags.tag_name
     *
     * @param tagName the value for cfg_tags.tag_name
     *
     * @mbggenerated
     */
    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cfg_tags.tag_desc
     *
     * @return the value of cfg_tags.tag_desc
     *
     * @mbggenerated
     */
    public String getTagDesc() {
        return tagDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cfg_tags.tag_desc
     *
     * @param tagDesc the value for cfg_tags.tag_desc
     *
     * @mbggenerated
     */
    public void setTagDesc(String tagDesc) {
        this.tagDesc = tagDesc == null ? null : tagDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cfg_tags.status
     *
     * @return the value of cfg_tags.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cfg_tags.status
     *
     * @param status the value for cfg_tags.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}