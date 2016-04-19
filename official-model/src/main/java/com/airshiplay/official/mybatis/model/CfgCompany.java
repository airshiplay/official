package com.airshiplay.official.mybatis.model;

public class CfgCompany {
    /**
     * database column <code>cfg_company.id</code>
     */
    private Long id;

    /**
     * database column <code>cfg_company.name</code>
     */
    private String name;

    /**
     * database column <code>cfg_company.address</code>
     */
    private String address;

    /**
     * database column <code>cfg_company.tel</code>
     */
    private String tel;

    /**
     * database column <code>cfg_company.zipcode</code>
     */
    private String zipcode;

    /**
     * database column <code>cfg_company.site_title</code>
     */
    private String siteTitle;

    /**
     * database column <code>cfg_company.meta_keyword</code>
     */
    private String metaKeyword;

    /**
     * database column <code>cfg_company.meta_description</code>
     */
    private String metaDescription;

    /**
     * database column <code>cfg_company.meta_author</code>
     */
    private String metaAuthor;

    /**
     * 网站-favicon.ico
     * <p> 
     * database column <code>cfg_company.site_favicon</code>
     */
    private String siteFavicon;

    /**
     * database column <code>cfg_company.site_icp</code>
     */
    private String siteIcp;

    /**
     * 网站域名
     * <p> 
     * database column <code>cfg_company.site_domain</code>
     */
    private String siteDomain;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * @return zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * @param zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    /**
     * @return site_title
     */
    public String getSiteTitle() {
        return siteTitle;
    }

    /**
     * @param siteTitle
     */
    public void setSiteTitle(String siteTitle) {
        this.siteTitle = siteTitle == null ? null : siteTitle.trim();
    }

    /**
     * @return meta_keyword
     */
    public String getMetaKeyword() {
        return metaKeyword;
    }

    /**
     * @param metaKeyword
     */
    public void setMetaKeyword(String metaKeyword) {
        this.metaKeyword = metaKeyword == null ? null : metaKeyword.trim();
    }

    /**
     * @return meta_description
     */
    public String getMetaDescription() {
        return metaDescription;
    }

    /**
     * @param metaDescription
     */
    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription == null ? null : metaDescription.trim();
    }

    /**
     * @return meta_author
     */
    public String getMetaAuthor() {
        return metaAuthor;
    }

    /**
     * @param metaAuthor
     */
    public void setMetaAuthor(String metaAuthor) {
        this.metaAuthor = metaAuthor == null ? null : metaAuthor.trim();
    }

    /**
     * 获取网站-favicon.ico
     *
     * @return site_favicon - 网站-favicon.ico
     */
    public String getSiteFavicon() {
        return siteFavicon;
    }

    /**
     * 设置网站-favicon.ico
     *
     * @param siteFavicon 网站-favicon.ico
     */
    public void setSiteFavicon(String siteFavicon) {
        this.siteFavicon = siteFavicon == null ? null : siteFavicon.trim();
    }

    /**
     * @return site_icp
     */
    public String getSiteIcp() {
        return siteIcp;
    }

    /**
     * @param siteIcp
     */
    public void setSiteIcp(String siteIcp) {
        this.siteIcp = siteIcp == null ? null : siteIcp.trim();
    }

    /**
     * 获取网站域名
     *
     * @return site_domain - 网站域名
     */
    public String getSiteDomain() {
        return siteDomain;
    }

    /**
     * 设置网站域名
     *
     * @param siteDomain 网站域名
     */
    public void setSiteDomain(String siteDomain) {
        this.siteDomain = siteDomain == null ? null : siteDomain.trim();
    }
}