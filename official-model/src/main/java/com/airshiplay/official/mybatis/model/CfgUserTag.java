package com.airshiplay.official.mybatis.model;

import java.util.Date;

public class CfgUserTag {
    /**
     * database column <code>cfg_user_tag.id</code>
     */
    private Long id;

    /**
     * database column <code>cfg_user_tag.uid</code>
     */
    private Long uid;

    /**
     * database column <code>cfg_user_tag.tag_id</code>
     */
    private Long tagId;

    /**
     * 用户标记时间
     * <p> 
     * database column <code>cfg_user_tag.create_time</code>
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
     * @return tag_id
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * @param tagId
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    /**
     * 获取用户标记时间
     *
     * @return create_time - 用户标记时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置用户标记时间
     *
     * @param createTime 用户标记时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}