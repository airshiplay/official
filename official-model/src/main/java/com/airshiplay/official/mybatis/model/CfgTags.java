package com.airshiplay.official.mybatis.model;

import java.io.Serializable;

public class CfgTags implements Serializable {
    /**
     * database column <code>cfg_tags.id</code>
     */
    private Long id;

    /**
     * 1、用户标签；2、文章标签；3、微信标签；4、
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
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cfg_tags
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
     * 获取1、用户标签；2、文章标签；3、微信标签；4、
     *
     * @return tag_type - 1、用户标签；2、文章标签；3、微信标签；4、
     */
    public Integer getTagType() {
        return tagType;
    }

    /**
     * 设置1、用户标签；2、文章标签；3、微信标签；4、
     *
     * @param tagType 1、用户标签；2、文章标签；3、微信标签；4、
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_tags
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
        CfgTags other = (CfgTags) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTagType() == null ? other.getTagType() == null : this.getTagType().equals(other.getTagType()))
            && (this.getTagName() == null ? other.getTagName() == null : this.getTagName().equals(other.getTagName()))
            && (this.getTagDesc() == null ? other.getTagDesc() == null : this.getTagDesc().equals(other.getTagDesc()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_tags
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTagType() == null) ? 0 : getTagType().hashCode());
        result = prime * result + ((getTagName() == null) ? 0 : getTagName().hashCode());
        result = prime * result + ((getTagDesc() == null) ? 0 : getTagDesc().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_tags
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tagType=").append(tagType);
        sb.append(", tagName=").append(tagName);
        sb.append(", tagDesc=").append(tagDesc);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}