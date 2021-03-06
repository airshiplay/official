package com.airshiplay.official.mybatis.mapper;

import com.airshiplay.official.mybatis.model.CfgPage;
import com.airshiplay.official.mybatis.model.CfgPageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CfgPageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_page
     * @mbggenerated
     */
    int countByExample(CfgPageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_page
     * @mbggenerated
     */
    int deleteByExample(CfgPageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_page
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_page
     * @mbggenerated
     */
    int insert(CfgPage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_page
     * @mbggenerated
     */
    int insertSelective(CfgPage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_page
     * @mbggenerated
     */
    List<CfgPage> selectByExample(CfgPageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_page
     * @mbggenerated
     */
    CfgPage selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_page
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CfgPage record, @Param("example") CfgPageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_page
     * @mbggenerated
     */
    int updateByExample(@Param("record") CfgPage record, @Param("example") CfgPageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_page
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CfgPage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_page
     * @mbggenerated
     */
    int updateByPrimaryKey(CfgPage record);
}