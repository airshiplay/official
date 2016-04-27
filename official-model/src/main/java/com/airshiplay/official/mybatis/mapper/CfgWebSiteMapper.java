package com.airshiplay.official.mybatis.mapper;

import com.airshiplay.official.mybatis.model.CfgWebSite;
import com.airshiplay.official.mybatis.model.CfgWebSiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CfgWebSiteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    int countByExample(CfgWebSiteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    int deleteByExample(CfgWebSiteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    int insert(CfgWebSite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    int insertSelective(CfgWebSite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    List<CfgWebSite> selectByExample(CfgWebSiteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    CfgWebSite selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CfgWebSite record, @Param("example") CfgWebSiteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    int updateByExample(@Param("record") CfgWebSite record, @Param("example") CfgWebSiteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CfgWebSite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_web_site
     * @mbggenerated
     */
    int updateByPrimaryKey(CfgWebSite record);
}