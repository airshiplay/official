package com.airshiplay.official.mybatis.model;

import java.io.Serializable;

public class QuSubject implements Serializable {
    /**
     * database column <code>qu_subject.id</code>
     */
    private Long id;

    /**
     * 话题ID
     * <p> 
     * database column <code>qu_subject.topic_id</code>
     */
    private Long topicId;

    /**
     * 题目编号
     * <p> 
     * database column <code>qu_subject.no</code>
     */
    private String no;

    /**
     * 题目标题
     * <p> 
     * database column <code>qu_subject.title</code>
     */
    private String title;

    /**
     * 题目选项类型1、单选；2、多选；3、填写
     * <p> 
     * database column <code>qu_subject.type</code>
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table qu_subject
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
     * 获取话题ID
     *
     * @return topic_id - 话题ID
     */
    public Long getTopicId() {
        return topicId;
    }

    /**
     * 设置话题ID
     *
     * @param topicId 话题ID
     */
    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    /**
     * 获取题目编号
     *
     * @return no - 题目编号
     */
    public String getNo() {
        return no;
    }

    /**
     * 设置题目编号
     *
     * @param no 题目编号
     */
    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    /**
     * 获取题目标题
     *
     * @return title - 题目标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置题目标题
     *
     * @param title 题目标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取题目选项类型1、单选；2、多选；3、填写
     *
     * @return type - 题目选项类型1、单选；2、多选；3、填写
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置题目选项类型1、单选；2、多选；3、填写
     *
     * @param type 题目选项类型1、单选；2、多选；3、填写
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qu_subject
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
        QuSubject other = (QuSubject) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTopicId() == null ? other.getTopicId() == null : this.getTopicId().equals(other.getTopicId()))
            && (this.getNo() == null ? other.getNo() == null : this.getNo().equals(other.getNo()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qu_subject
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTopicId() == null) ? 0 : getTopicId().hashCode());
        result = prime * result + ((getNo() == null) ? 0 : getNo().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qu_subject
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", topicId=").append(topicId);
        sb.append(", no=").append(no);
        sb.append(", title=").append(title);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}