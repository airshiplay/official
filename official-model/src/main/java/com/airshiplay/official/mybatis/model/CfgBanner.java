package com.airshiplay.official.mybatis.model;

public class CfgBanner {
    /**
     * database column <code>cfg_banner.id</code>
     */
    private Long id;

    /**
     * database column <code>cfg_banner.banner_width</code>
     */
    private Integer bannerWidth;

    /**
     * database column <code>cfg_banner.banner_height</code>
     */
    private Integer bannerHeight;

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
     * @return banner_width
     */
    public Integer getBannerWidth() {
        return bannerWidth;
    }

    /**
     * @param bannerWidth
     */
    public void setBannerWidth(Integer bannerWidth) {
        this.bannerWidth = bannerWidth;
    }

    /**
     * @return banner_height
     */
    public Integer getBannerHeight() {
        return bannerHeight;
    }

    /**
     * @param bannerHeight
     */
    public void setBannerHeight(Integer bannerHeight) {
        this.bannerHeight = bannerHeight;
    }
}