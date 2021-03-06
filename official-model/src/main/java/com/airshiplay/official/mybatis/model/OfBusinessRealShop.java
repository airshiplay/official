package com.airshiplay.official.mybatis.model;

import java.io.Serializable;
import java.util.Date;

public class OfBusinessRealShop implements Serializable {
    /**
     * database column <code>of_business_real_shop.id</code>
     */
    private Long id;

    /**
     * 实体店类型
     * <p> 
     * database column <code>of_business_real_shop.category_id</code>
     */
    private Long categoryId;

    /**
     * 实体店、加盟店名称
     * <p> 
     * database column <code>of_business_real_shop.name</code>
     */
    private String name;

    /**
     * 地址
     * <p> 
     * database column <code>of_business_real_shop.address</code>
     */
    private String address;

    /**
     * 经度
     * <p> 
     * database column <code>of_business_real_shop.lng</code>
     */
    private String lng;

    /**
     * 纬度
     * <p> 
     * database column <code>of_business_real_shop.lat</code>
     */
    private String lat;

    /**
     * 实体店所在区域
     * <p> 
     * database column <code>of_business_real_shop.area_id</code>
     */
    private Long areaId;

    /**
     * database column <code>of_business_real_shop.desc_</code>
     */
    private String desc;

    /**
     * database column <code>of_business_real_shop.create_time</code>
     */
    private Date createTime;

    /**
     * 2、生效
     * <p> 
     * database column <code>of_business_real_shop.status</code>
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table of_business_real_shop
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
     * 获取实体店类型
     *
     * @return category_id - 实体店类型
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * 设置实体店类型
     *
     * @param categoryId 实体店类型
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 获取实体店、加盟店名称
     *
     * @return name - 实体店、加盟店名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置实体店、加盟店名称
     *
     * @param name 实体店、加盟店名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取经度
     *
     * @return lng - 经度
     */
    public String getLng() {
        return lng;
    }

    /**
     * 设置经度
     *
     * @param lng 经度
     */
    public void setLng(String lng) {
        this.lng = lng == null ? null : lng.trim();
    }

    /**
     * 获取纬度
     *
     * @return lat - 纬度
     */
    public String getLat() {
        return lat;
    }

    /**
     * 设置纬度
     *
     * @param lat 纬度
     */
    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    /**
     * 获取实体店所在区域
     *
     * @return area_id - 实体店所在区域
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * 设置实体店所在区域
     *
     * @param areaId 实体店所在区域
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
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
     * 获取2、生效
     *
     * @return status - 2、生效
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置2、生效
     *
     * @param status 2、生效
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_business_real_shop
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
        OfBusinessRealShop other = (OfBusinessRealShop) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getLng() == null ? other.getLng() == null : this.getLng().equals(other.getLng()))
            && (this.getLat() == null ? other.getLat() == null : this.getLat().equals(other.getLat()))
            && (this.getAreaId() == null ? other.getAreaId() == null : this.getAreaId().equals(other.getAreaId()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_business_real_shop
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getLng() == null) ? 0 : getLng().hashCode());
        result = prime * result + ((getLat() == null) ? 0 : getLat().hashCode());
        result = prime * result + ((getAreaId() == null) ? 0 : getAreaId().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_business_real_shop
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", name=").append(name);
        sb.append(", address=").append(address);
        sb.append(", lng=").append(lng);
        sb.append(", lat=").append(lat);
        sb.append(", areaId=").append(areaId);
        sb.append(", desc=").append(desc);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}