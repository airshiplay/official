package com.airshiplay.official.mybatis.model;

import java.util.Date;

public class IpBsLb {
    /**
     * database column <code>ip_bs_lb.id</code>
     */
    private Long id;

    /**
     * database column <code>ip_bs_lb.ip</code>
     */
    private String ip;

    /**
     * database column <code>ip_bs_lb.country</code>
     */
    private String country;

    /**
     * database column <code>ip_bs_lb.country_code</code>
     */
    private String countryCode;

    /**
     * database column <code>ip_bs_lb.province</code>
     */
    private String province;

    /**
     * database column <code>ip_bs_lb.city</code>
     */
    private String city;

    /**
     * database column <code>ip_bs_lb.city_code</code>
     */
    private String cityCode;

    /**
     * 区/县
     * <p> 
     * database column <code>ip_bs_lb.district</code>
     */
    private String district;

    /**
     * database column <code>ip_bs_lb.street_number</code>
     */
    private String streetNumber;

    /**
     * 街道
     * <p> 
     * database column <code>ip_bs_lb.street</code>
     */
    private String street;

    /**
     * database column <code>ip_bs_lb.address</code>
     */
    private String address;

    /**
     * 纬度
     * <p> 
     * database column <code>ip_bs_lb.lat</code>
     */
    private String lat;

    /**
     * 经度
     * <p> 
     * database column <code>ip_bs_lb.lng</code>
     */
    private String lng;

    /**
     * database column <code>ip_bs_lb.operator</code>
     */
    private String operator;

    /**
     * 数据提供者
     * <p> 
     * database column <code>ip_bs_lb.provider</code>
     */
    private String provider;

    /**
     * 小区号
     * <p> 
     * database column <code>ip_bs_lb.lac</code>
     */
    private Integer lac;

    /**
     * 基站号\基站号(bid)
     * <p> 
     * database column <code>ip_bs_lb.cellid</code>
     */
    private Integer cellid;

    /**
     * 移动基站：0 联通基站:1 电信基站
     * <p> 
     * database column <code>ip_bs_lb.mnc</code>
     */
    private Integer mnc;

    /**
     * SID系统识别码（各地区一个）
     * <p> 
     * database column <code>ip_bs_lb.sid</code>
     */
    private Integer sid;

    /**
     * NID网络识别码（各地区1-3个）
     * <p> 
     * database column <code>ip_bs_lb.nid</code>
     */
    private Integer nid;

    /**
     * database column <code>ip_bs_lb.create_time</code>
     */
    private Date createTime;

    /**
     * database column <code>ip_bs_lb.uuid</code>
     */
    private String uuid;

    /**
     * 设备来源
     * <p> 
     * database column <code>ip_bs_lb.model</code>
     */
    private String model;

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
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * @return country_code
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    /**
     * @return province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * @return city_code
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * @param cityCode
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * 获取区/县
     *
     * @return district - 区/县
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 设置区/县
     *
     * @param district 区/县
     */
    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    /**
     * @return street_number
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * @param streetNumber
     */
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber == null ? null : streetNumber.trim();
    }

    /**
     * 获取街道
     *
     * @return street - 街道
     */
    public String getStreet() {
        return street;
    }

    /**
     * 设置街道
     *
     * @param street 街道
     */
    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * 获取数据提供者
     *
     * @return provider - 数据提供者
     */
    public String getProvider() {
        return provider;
    }

    /**
     * 设置数据提供者
     *
     * @param provider 数据提供者
     */
    public void setProvider(String provider) {
        this.provider = provider == null ? null : provider.trim();
    }

    /**
     * 获取小区号
     *
     * @return lac - 小区号
     */
    public Integer getLac() {
        return lac;
    }

    /**
     * 设置小区号
     *
     * @param lac 小区号
     */
    public void setLac(Integer lac) {
        this.lac = lac;
    }

    /**
     * 获取基站号\基站号(bid)
     *
     * @return cellid - 基站号\基站号(bid)
     */
    public Integer getCellid() {
        return cellid;
    }

    /**
     * 设置基站号\基站号(bid)
     *
     * @param cellid 基站号\基站号(bid)
     */
    public void setCellid(Integer cellid) {
        this.cellid = cellid;
    }

    /**
     * 获取移动基站：0 联通基站:1 电信基站
     *
     * @return mnc - 移动基站：0 联通基站:1 电信基站
     */
    public Integer getMnc() {
        return mnc;
    }

    /**
     * 设置移动基站：0 联通基站:1 电信基站
     *
     * @param mnc 移动基站：0 联通基站:1 电信基站
     */
    public void setMnc(Integer mnc) {
        this.mnc = mnc;
    }

    /**
     * 获取SID系统识别码（各地区一个）
     *
     * @return sid - SID系统识别码（各地区一个）
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * 设置SID系统识别码（各地区一个）
     *
     * @param sid SID系统识别码（各地区一个）
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * 获取NID网络识别码（各地区1-3个）
     *
     * @return nid - NID网络识别码（各地区1-3个）
     */
    public Integer getNid() {
        return nid;
    }

    /**
     * 设置NID网络识别码（各地区1-3个）
     *
     * @param nid NID网络识别码（各地区1-3个）
     */
    public void setNid(Integer nid) {
        this.nid = nid;
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
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    /**
     * 获取设备来源
     *
     * @return model - 设备来源
     */
    public String getModel() {
        return model;
    }

    /**
     * 设置设备来源
     *
     * @param model 设备来源
     */
    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }
}