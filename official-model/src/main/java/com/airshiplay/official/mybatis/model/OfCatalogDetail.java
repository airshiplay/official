package com.airshiplay.official.mybatis.model;

import java.util.Date;

public class OfCatalogDetail {
    /**
     * database column <code>of_catalog_detail.id</code>
     */
    private Long id;

    /**
     * database column <code>of_catalog_detail.catalog_id</code>
     */
    private Long catalogId;

    /**
     * database column <code>of_catalog_detail.title</code>
     */
    private String title;

    /**
     * database column <code>of_catalog_detail.brief</code>
     */
    private String brief;

    /**
     * database column <code>of_catalog_detail.author</code>
     */
    private String author;

    /**
     * database column <code>of_catalog_detail.create_time</code>
     */
    private Date createTime;

    /**
     * 1审核，2生效，3过期
     * <p> 
     * database column <code>of_catalog_detail.status</code>
     */
    private Integer status;

    /**
     * database column <code>of_catalog_detail.update_time</code>
     */
    private Date updateTime;

    /**
     * database column <code>of_catalog_detail.desc</code>
     */
    private String desc;

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
     * @return catalog_id
     */
    public Long getCatalogId() {
        return catalogId;
    }

    /**
     * @param catalogId
     */
    public void setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * @return brief
     */
    public String getBrief() {
        return brief;
    }

    /**
     * @param brief
     */
    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    /**
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
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
     * 获取1审核，2生效，3过期
     *
     * @return status - 1审核，2生效，3过期
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置1审核，2生效，3过期
     *
     * @param status 1审核，2生效，3过期
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}