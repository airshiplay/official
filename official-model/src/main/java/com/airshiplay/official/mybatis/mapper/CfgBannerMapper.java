package com.airshiplay.official.mybatis.mapper;

import com.airshiplay.official.mybatis.model.CfgBanner;
import com.airshiplay.official.mybatis.model.CfgBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CfgBannerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_banner
     *
     * @mbggenerated
     */
    int countByExample(CfgBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_banner
     *
     * @mbggenerated
     */
    int deleteByExample(CfgBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_banner
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_banner
     *
     * @mbggenerated
     */
    int insert(CfgBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_banner
     *
     * @mbggenerated
     */
    int insertSelective(CfgBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_banner
     *
     * @mbggenerated
     */
    List<CfgBanner> selectByExample(CfgBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_banner
     *
     * @mbggenerated
     */
    CfgBanner selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_banner
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CfgBanner record, @Param("example") CfgBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_banner
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CfgBanner record, @Param("example") CfgBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_banner
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CfgBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_banner
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CfgBanner record);
}