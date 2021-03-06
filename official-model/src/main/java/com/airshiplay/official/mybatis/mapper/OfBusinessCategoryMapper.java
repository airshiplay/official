package com.airshiplay.official.mybatis.mapper;

import com.airshiplay.official.mybatis.model.OfBusinessCategory;
import com.airshiplay.official.mybatis.model.OfBusinessCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfBusinessCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_business_category
     * @mbggenerated
     */
    int countByExample(OfBusinessCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_business_category
     * @mbggenerated
     */
    int deleteByExample(OfBusinessCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_business_category
     * @mbggenerated
     */
    int insert(OfBusinessCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_business_category
     * @mbggenerated
     */
    int insertSelective(OfBusinessCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_business_category
     * @mbggenerated
     */
    List<OfBusinessCategory> selectByExample(OfBusinessCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_business_category
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") OfBusinessCategory record, @Param("example") OfBusinessCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_business_category
     * @mbggenerated
     */
    int updateByExample(@Param("record") OfBusinessCategory record, @Param("example") OfBusinessCategoryExample example);
}