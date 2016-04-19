package com.airshiplay.official.mybatis.model;

public class OfCatalog {
    /**
     * 主键自增长
     * <p> 
     * database column <code>of_catalog.id</code>
     */
    private Long id;

    /**
     * database column <code>of_catalog.catalog_name</code>
     */
    private String catalogName;

    /**
     * database column <code>of_catalog.remark</code>
     */
    private String remark;

    /**
     * 栏目显示顺序
     * <p> 
     * database column <code>of_catalog.seq</code>
     */
    private Integer seq;

    /**
     * 栏目状态
     * <p> 
     * database column <code>of_catalog.status</code>
     */
    private Integer status;

    /**
     * 上级栏目ID
     * <p> 
     * database column <code>of_catalog.upid</code>
     */
    private Long upid;

    /**
     * 栏目类型-detail页面-list列表页面
     * <p> 
     * database column <code>of_catalog.type</code>
     */
    private String type;

    /**
     * 层次等级
     * <p> 
     * database column <code>of_catalog.level</code>
     */
    private Integer level;

    /**
     * url访问路径
     * <p> 
     * database column <code>of_catalog.url_path</code>
     */
    private String urlPath;

    /**
     * 获取主键自增长
     *
     * @return id - 主键自增长
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键自增长
     *
     * @param id 主键自增长
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return catalog_name
     */
    public String getCatalogName() {
        return catalogName;
    }

    /**
     * @param catalogName
     */
    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName == null ? null : catalogName.trim();
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取栏目显示顺序
     *
     * @return seq - 栏目显示顺序
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * 设置栏目显示顺序
     *
     * @param seq 栏目显示顺序
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * 获取栏目状态
     *
     * @return status - 栏目状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置栏目状态
     *
     * @param status 栏目状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取上级栏目ID
     *
     * @return upid - 上级栏目ID
     */
    public Long getUpid() {
        return upid;
    }

    /**
     * 设置上级栏目ID
     *
     * @param upid 上级栏目ID
     */
    public void setUpid(Long upid) {
        this.upid = upid;
    }

    /**
     * 获取栏目类型-detail页面-list列表页面
     *
     * @return type - 栏目类型-detail页面-list列表页面
     */
    public String getType() {
        return type;
    }

    /**
     * 设置栏目类型-detail页面-list列表页面
     *
     * @param type 栏目类型-detail页面-list列表页面
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取层次等级
     *
     * @return level - 层次等级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置层次等级
     *
     * @param level 层次等级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取url访问路径
     *
     * @return url_path - url访问路径
     */
    public String getUrlPath() {
        return urlPath;
    }

    /**
     * 设置url访问路径
     *
     * @param urlPath url访问路径
     */
    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath == null ? null : urlPath.trim();
    }
}