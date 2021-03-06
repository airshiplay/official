package com.airshiplay.official.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class CfgWebSiteExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    public CfgWebSiteExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNull() {
            addCriterion("zipcode is null");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNotNull() {
            addCriterion("zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andZipcodeEqualTo(String value) {
            addCriterion("zipcode =", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotEqualTo(String value) {
            addCriterion("zipcode <>", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThan(String value) {
            addCriterion("zipcode >", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("zipcode >=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThan(String value) {
            addCriterion("zipcode <", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThanOrEqualTo(String value) {
            addCriterion("zipcode <=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLike(String value) {
            addCriterion("zipcode like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotLike(String value) {
            addCriterion("zipcode not like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeIn(List<String> values) {
            addCriterion("zipcode in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotIn(List<String> values) {
            addCriterion("zipcode not in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeBetween(String value1, String value2) {
            addCriterion("zipcode between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotBetween(String value1, String value2) {
            addCriterion("zipcode not between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andSiteTitleIsNull() {
            addCriterion("site_title is null");
            return (Criteria) this;
        }

        public Criteria andSiteTitleIsNotNull() {
            addCriterion("site_title is not null");
            return (Criteria) this;
        }

        public Criteria andSiteTitleEqualTo(String value) {
            addCriterion("site_title =", value, "siteTitle");
            return (Criteria) this;
        }

        public Criteria andSiteTitleNotEqualTo(String value) {
            addCriterion("site_title <>", value, "siteTitle");
            return (Criteria) this;
        }

        public Criteria andSiteTitleGreaterThan(String value) {
            addCriterion("site_title >", value, "siteTitle");
            return (Criteria) this;
        }

        public Criteria andSiteTitleGreaterThanOrEqualTo(String value) {
            addCriterion("site_title >=", value, "siteTitle");
            return (Criteria) this;
        }

        public Criteria andSiteTitleLessThan(String value) {
            addCriterion("site_title <", value, "siteTitle");
            return (Criteria) this;
        }

        public Criteria andSiteTitleLessThanOrEqualTo(String value) {
            addCriterion("site_title <=", value, "siteTitle");
            return (Criteria) this;
        }

        public Criteria andSiteTitleLike(String value) {
            addCriterion("site_title like", value, "siteTitle");
            return (Criteria) this;
        }

        public Criteria andSiteTitleNotLike(String value) {
            addCriterion("site_title not like", value, "siteTitle");
            return (Criteria) this;
        }

        public Criteria andSiteTitleIn(List<String> values) {
            addCriterion("site_title in", values, "siteTitle");
            return (Criteria) this;
        }

        public Criteria andSiteTitleNotIn(List<String> values) {
            addCriterion("site_title not in", values, "siteTitle");
            return (Criteria) this;
        }

        public Criteria andSiteTitleBetween(String value1, String value2) {
            addCriterion("site_title between", value1, value2, "siteTitle");
            return (Criteria) this;
        }

        public Criteria andSiteTitleNotBetween(String value1, String value2) {
            addCriterion("site_title not between", value1, value2, "siteTitle");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordIsNull() {
            addCriterion("meta_keyword is null");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordIsNotNull() {
            addCriterion("meta_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordEqualTo(String value) {
            addCriterion("meta_keyword =", value, "metaKeyword");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordNotEqualTo(String value) {
            addCriterion("meta_keyword <>", value, "metaKeyword");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordGreaterThan(String value) {
            addCriterion("meta_keyword >", value, "metaKeyword");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("meta_keyword >=", value, "metaKeyword");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordLessThan(String value) {
            addCriterion("meta_keyword <", value, "metaKeyword");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordLessThanOrEqualTo(String value) {
            addCriterion("meta_keyword <=", value, "metaKeyword");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordLike(String value) {
            addCriterion("meta_keyword like", value, "metaKeyword");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordNotLike(String value) {
            addCriterion("meta_keyword not like", value, "metaKeyword");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordIn(List<String> values) {
            addCriterion("meta_keyword in", values, "metaKeyword");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordNotIn(List<String> values) {
            addCriterion("meta_keyword not in", values, "metaKeyword");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordBetween(String value1, String value2) {
            addCriterion("meta_keyword between", value1, value2, "metaKeyword");
            return (Criteria) this;
        }

        public Criteria andMetaKeywordNotBetween(String value1, String value2) {
            addCriterion("meta_keyword not between", value1, value2, "metaKeyword");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionIsNull() {
            addCriterion("meta_description is null");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionIsNotNull() {
            addCriterion("meta_description is not null");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionEqualTo(String value) {
            addCriterion("meta_description =", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionNotEqualTo(String value) {
            addCriterion("meta_description <>", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionGreaterThan(String value) {
            addCriterion("meta_description >", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("meta_description >=", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionLessThan(String value) {
            addCriterion("meta_description <", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionLessThanOrEqualTo(String value) {
            addCriterion("meta_description <=", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionLike(String value) {
            addCriterion("meta_description like", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionNotLike(String value) {
            addCriterion("meta_description not like", value, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionIn(List<String> values) {
            addCriterion("meta_description in", values, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionNotIn(List<String> values) {
            addCriterion("meta_description not in", values, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionBetween(String value1, String value2) {
            addCriterion("meta_description between", value1, value2, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaDescriptionNotBetween(String value1, String value2) {
            addCriterion("meta_description not between", value1, value2, "metaDescription");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorIsNull() {
            addCriterion("meta_author is null");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorIsNotNull() {
            addCriterion("meta_author is not null");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorEqualTo(String value) {
            addCriterion("meta_author =", value, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorNotEqualTo(String value) {
            addCriterion("meta_author <>", value, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorGreaterThan(String value) {
            addCriterion("meta_author >", value, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("meta_author >=", value, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorLessThan(String value) {
            addCriterion("meta_author <", value, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorLessThanOrEqualTo(String value) {
            addCriterion("meta_author <=", value, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorLike(String value) {
            addCriterion("meta_author like", value, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorNotLike(String value) {
            addCriterion("meta_author not like", value, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorIn(List<String> values) {
            addCriterion("meta_author in", values, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorNotIn(List<String> values) {
            addCriterion("meta_author not in", values, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorBetween(String value1, String value2) {
            addCriterion("meta_author between", value1, value2, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andMetaAuthorNotBetween(String value1, String value2) {
            addCriterion("meta_author not between", value1, value2, "metaAuthor");
            return (Criteria) this;
        }

        public Criteria andSiteFaviconIsNull() {
            addCriterion("site_favicon is null");
            return (Criteria) this;
        }

        public Criteria andSiteFaviconIsNotNull() {
            addCriterion("site_favicon is not null");
            return (Criteria) this;
        }

        public Criteria andSiteFaviconEqualTo(String value) {
            addCriterion("site_favicon =", value, "siteFavicon");
            return (Criteria) this;
        }

        public Criteria andSiteFaviconNotEqualTo(String value) {
            addCriterion("site_favicon <>", value, "siteFavicon");
            return (Criteria) this;
        }

        public Criteria andSiteFaviconGreaterThan(String value) {
            addCriterion("site_favicon >", value, "siteFavicon");
            return (Criteria) this;
        }

        public Criteria andSiteFaviconGreaterThanOrEqualTo(String value) {
            addCriterion("site_favicon >=", value, "siteFavicon");
            return (Criteria) this;
        }

        public Criteria andSiteFaviconLessThan(String value) {
            addCriterion("site_favicon <", value, "siteFavicon");
            return (Criteria) this;
        }

        public Criteria andSiteFaviconLessThanOrEqualTo(String value) {
            addCriterion("site_favicon <=", value, "siteFavicon");
            return (Criteria) this;
        }

        public Criteria andSiteFaviconLike(String value) {
            addCriterion("site_favicon like", value, "siteFavicon");
            return (Criteria) this;
        }

        public Criteria andSiteFaviconNotLike(String value) {
            addCriterion("site_favicon not like", value, "siteFavicon");
            return (Criteria) this;
        }

        public Criteria andSiteFaviconIn(List<String> values) {
            addCriterion("site_favicon in", values, "siteFavicon");
            return (Criteria) this;
        }

        public Criteria andSiteFaviconNotIn(List<String> values) {
            addCriterion("site_favicon not in", values, "siteFavicon");
            return (Criteria) this;
        }

        public Criteria andSiteFaviconBetween(String value1, String value2) {
            addCriterion("site_favicon between", value1, value2, "siteFavicon");
            return (Criteria) this;
        }

        public Criteria andSiteFaviconNotBetween(String value1, String value2) {
            addCriterion("site_favicon not between", value1, value2, "siteFavicon");
            return (Criteria) this;
        }

        public Criteria andSiteIcpIsNull() {
            addCriterion("site_icp is null");
            return (Criteria) this;
        }

        public Criteria andSiteIcpIsNotNull() {
            addCriterion("site_icp is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIcpEqualTo(String value) {
            addCriterion("site_icp =", value, "siteIcp");
            return (Criteria) this;
        }

        public Criteria andSiteIcpNotEqualTo(String value) {
            addCriterion("site_icp <>", value, "siteIcp");
            return (Criteria) this;
        }

        public Criteria andSiteIcpGreaterThan(String value) {
            addCriterion("site_icp >", value, "siteIcp");
            return (Criteria) this;
        }

        public Criteria andSiteIcpGreaterThanOrEqualTo(String value) {
            addCriterion("site_icp >=", value, "siteIcp");
            return (Criteria) this;
        }

        public Criteria andSiteIcpLessThan(String value) {
            addCriterion("site_icp <", value, "siteIcp");
            return (Criteria) this;
        }

        public Criteria andSiteIcpLessThanOrEqualTo(String value) {
            addCriterion("site_icp <=", value, "siteIcp");
            return (Criteria) this;
        }

        public Criteria andSiteIcpLike(String value) {
            addCriterion("site_icp like", value, "siteIcp");
            return (Criteria) this;
        }

        public Criteria andSiteIcpNotLike(String value) {
            addCriterion("site_icp not like", value, "siteIcp");
            return (Criteria) this;
        }

        public Criteria andSiteIcpIn(List<String> values) {
            addCriterion("site_icp in", values, "siteIcp");
            return (Criteria) this;
        }

        public Criteria andSiteIcpNotIn(List<String> values) {
            addCriterion("site_icp not in", values, "siteIcp");
            return (Criteria) this;
        }

        public Criteria andSiteIcpBetween(String value1, String value2) {
            addCriterion("site_icp between", value1, value2, "siteIcp");
            return (Criteria) this;
        }

        public Criteria andSiteIcpNotBetween(String value1, String value2) {
            addCriterion("site_icp not between", value1, value2, "siteIcp");
            return (Criteria) this;
        }

        public Criteria andSiteDomainIsNull() {
            addCriterion("site_domain is null");
            return (Criteria) this;
        }

        public Criteria andSiteDomainIsNotNull() {
            addCriterion("site_domain is not null");
            return (Criteria) this;
        }

        public Criteria andSiteDomainEqualTo(String value) {
            addCriterion("site_domain =", value, "siteDomain");
            return (Criteria) this;
        }

        public Criteria andSiteDomainNotEqualTo(String value) {
            addCriterion("site_domain <>", value, "siteDomain");
            return (Criteria) this;
        }

        public Criteria andSiteDomainGreaterThan(String value) {
            addCriterion("site_domain >", value, "siteDomain");
            return (Criteria) this;
        }

        public Criteria andSiteDomainGreaterThanOrEqualTo(String value) {
            addCriterion("site_domain >=", value, "siteDomain");
            return (Criteria) this;
        }

        public Criteria andSiteDomainLessThan(String value) {
            addCriterion("site_domain <", value, "siteDomain");
            return (Criteria) this;
        }

        public Criteria andSiteDomainLessThanOrEqualTo(String value) {
            addCriterion("site_domain <=", value, "siteDomain");
            return (Criteria) this;
        }

        public Criteria andSiteDomainLike(String value) {
            addCriterion("site_domain like", value, "siteDomain");
            return (Criteria) this;
        }

        public Criteria andSiteDomainNotLike(String value) {
            addCriterion("site_domain not like", value, "siteDomain");
            return (Criteria) this;
        }

        public Criteria andSiteDomainIn(List<String> values) {
            addCriterion("site_domain in", values, "siteDomain");
            return (Criteria) this;
        }

        public Criteria andSiteDomainNotIn(List<String> values) {
            addCriterion("site_domain not in", values, "siteDomain");
            return (Criteria) this;
        }

        public Criteria andSiteDomainBetween(String value1, String value2) {
            addCriterion("site_domain between", value1, value2, "siteDomain");
            return (Criteria) this;
        }

        public Criteria andSiteDomainNotBetween(String value1, String value2) {
            addCriterion("site_domain not between", value1, value2, "siteDomain");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cfg_web_site
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}