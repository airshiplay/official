package com.airshiplay.official.mybatis.mapper;

import com.airshiplay.official.mybatis.model.OfBanner;
import com.airshiplay.official.mybatis.model.OfBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfBannerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_banner
     *
     * @mbggenerated
     */
    int countByExample(OfBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_banner
     *
     * @mbggenerated
     */
    int deleteByExample(OfBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_banner
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_banner
     *
     * @mbggenerated
     */
    int insert(OfBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_banner
     *
     * @mbggenerated
     */
    int insertSelective(OfBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_banner
     *
     * @mbggenerated
     */
    List<OfBanner> selectByExample(OfBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_banner
     *
     * @mbggenerated
     */
    OfBanner selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_banner
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") OfBanner record, @Param("example") OfBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_banner
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") OfBanner record, @Param("example") OfBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_banner
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OfBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_banner
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OfBanner record);
}