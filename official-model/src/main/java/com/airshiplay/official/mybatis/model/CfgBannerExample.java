package com.airshiplay.official.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class CfgBannerExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cfg_banner
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cfg_banner
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cfg_banner
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_banner
     * @mbggenerated
     */
    public CfgBannerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_banner
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_banner
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_banner
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_banner
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_banner
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_banner
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_banner
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_banner
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
     * This method corresponds to the database table cfg_banner
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_banner
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cfg_banner
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

        public Criteria andBannerWidthIsNull() {
            addCriterion("banner_width is null");
            return (Criteria) this;
        }

        public Criteria andBannerWidthIsNotNull() {
            addCriterion("banner_width is not null");
            return (Criteria) this;
        }

        public Criteria andBannerWidthEqualTo(Integer value) {
            addCriterion("banner_width =", value, "bannerWidth");
            return (Criteria) this;
        }

        public Criteria andBannerWidthNotEqualTo(Integer value) {
            addCriterion("banner_width <>", value, "bannerWidth");
            return (Criteria) this;
        }

        public Criteria andBannerWidthGreaterThan(Integer value) {
            addCriterion("banner_width >", value, "bannerWidth");
            return (Criteria) this;
        }

        public Criteria andBannerWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("banner_width >=", value, "bannerWidth");
            return (Criteria) this;
        }

        public Criteria andBannerWidthLessThan(Integer value) {
            addCriterion("banner_width <", value, "bannerWidth");
            return (Criteria) this;
        }

        public Criteria andBannerWidthLessThanOrEqualTo(Integer value) {
            addCriterion("banner_width <=", value, "bannerWidth");
            return (Criteria) this;
        }

        public Criteria andBannerWidthIn(List<Integer> values) {
            addCriterion("banner_width in", values, "bannerWidth");
            return (Criteria) this;
        }

        public Criteria andBannerWidthNotIn(List<Integer> values) {
            addCriterion("banner_width not in", values, "bannerWidth");
            return (Criteria) this;
        }

        public Criteria andBannerWidthBetween(Integer value1, Integer value2) {
            addCriterion("banner_width between", value1, value2, "bannerWidth");
            return (Criteria) this;
        }

        public Criteria andBannerWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("banner_width not between", value1, value2, "bannerWidth");
            return (Criteria) this;
        }

        public Criteria andBannerHeightIsNull() {
            addCriterion("banner_height is null");
            return (Criteria) this;
        }

        public Criteria andBannerHeightIsNotNull() {
            addCriterion("banner_height is not null");
            return (Criteria) this;
        }

        public Criteria andBannerHeightEqualTo(Integer value) {
            addCriterion("banner_height =", value, "bannerHeight");
            return (Criteria) this;
        }

        public Criteria andBannerHeightNotEqualTo(Integer value) {
            addCriterion("banner_height <>", value, "bannerHeight");
            return (Criteria) this;
        }

        public Criteria andBannerHeightGreaterThan(Integer value) {
            addCriterion("banner_height >", value, "bannerHeight");
            return (Criteria) this;
        }

        public Criteria andBannerHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("banner_height >=", value, "bannerHeight");
            return (Criteria) this;
        }

        public Criteria andBannerHeightLessThan(Integer value) {
            addCriterion("banner_height <", value, "bannerHeight");
            return (Criteria) this;
        }

        public Criteria andBannerHeightLessThanOrEqualTo(Integer value) {
            addCriterion("banner_height <=", value, "bannerHeight");
            return (Criteria) this;
        }

        public Criteria andBannerHeightIn(List<Integer> values) {
            addCriterion("banner_height in", values, "bannerHeight");
            return (Criteria) this;
        }

        public Criteria andBannerHeightNotIn(List<Integer> values) {
            addCriterion("banner_height not in", values, "bannerHeight");
            return (Criteria) this;
        }

        public Criteria andBannerHeightBetween(Integer value1, Integer value2) {
            addCriterion("banner_height between", value1, value2, "bannerHeight");
            return (Criteria) this;
        }

        public Criteria andBannerHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("banner_height not between", value1, value2, "bannerHeight");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cfg_banner
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cfg_banner
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