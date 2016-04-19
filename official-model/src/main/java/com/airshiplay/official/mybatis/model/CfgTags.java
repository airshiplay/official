package com.airshiplay.official.mybatis.model;

public class CfgTags {
    /**
     * database column <code>cfg_tags.id</code>
     */
    private Long id;

    /**
     * 1、用户标签；2、
     * <p> 
     * database column <code>cfg_tags.tag_type</code>
     */
    private Integer tagType;

    /**
     * 标签名称
     * <p> 
     * database column <code>cfg_tags.tag_name</code>
     */
    private String tagName;

    /**
     * 标签描述
     * <p> 
     * database column <code>cfg_tags.tag_desc</code>
     */
    private String tagDesc;

    /**
     * 1、禁用2、启用
     * <p> 
     * database column <code>cfg_tags.status</code>
     */
    private Integer status;

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
     * 获取1、用户标签；2、
     *
     * @return tag_type - 1、用户标签；2、
     */
    public Integer getTagType() {
        return tagType;
    }

    /**
     * 设置1、用户标签；2、
     *
     * @param tagType 1、用户标签；2、
     */
    public void setTagType(Integer tagType) {
        this.tagType = tagType;
    }

    /**
     * 获取标签名称
     *
     * @return tag_name - 标签名称
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * 设置标签名称
     *
     * @param tagName 标签名称
     */
    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    /**
     * 获取标签描述
     *
     * @return tag_desc - 标签描述
     */
    public String getTagDesc() {
        return tagDesc;
    }

    /**
     * 设置标签描述
     *
     * @param tagDesc 标签描述
     */
    public void setTagDesc(String tagDesc) {
        this.tagDesc = tagDesc == null ? null : tagDesc.trim();
    }

    /**
     * 获取1、禁用2、启用
     *
     * @return status - 1、禁用2、启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置1、禁用2、启用
     *
     * @param status 1、禁用2、启用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}