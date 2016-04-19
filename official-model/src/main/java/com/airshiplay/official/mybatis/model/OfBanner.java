package com.airshiplay.official.mybatis.model;

import java.util.Date;

public class OfBanner {
    /**
     * database column <code>of_banner.id</code>
     */
    private Long id;

    /**
     * database column <code>of_banner.title</code>
     */
    private String title;

    /**
     * database column <code>of_banner.desc_</code>
     */
    private String desc;

    /**
     * database column <code>of_banner.image_url</code>
     */
    private String imageUrl;

    /**
     * database column <code>of_banner.url</code>
     */
    private String url;

    /**
     * 显示顺序
     * <p> 
     * database column <code>of_banner.seq</code>
     */
    private Integer seq;

    /**
     * database column <code>of_banner.create_time</code>
     */
    private Date createTime;

    /**
     * database column <code>of_banner.update_time</code>
     */
    private Date updateTime;

    /**
     * 1、创建审核中；2生效
     * <p> 
     * database column <code>of_banner.status_</code>
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
     * @return desc_
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

    /**
     * @return image_url
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * @param imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取显示顺序
     *
     * @return seq - 显示顺序
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * 设置显示顺序
     *
     * @param seq 显示顺序
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
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
     * 获取1、创建审核中；2生效
     *
     * @return status_ - 1、创建审核中；2生效
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置1、创建审核中；2生效
     *
     * @param status 1、创建审核中；2生效
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}