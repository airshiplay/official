package com.airshiplay.official.mybatis.mapper;

import com.airshiplay.official.mybatis.model.CfgAccessToken;
import com.airshiplay.official.mybatis.model.CfgAccessTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CfgAccessTokenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_access_token
     * @mbggenerated
     */
    int countByExample(CfgAccessTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_access_token
     * @mbggenerated
     */
    int deleteByExample(CfgAccessTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_access_token
     * @mbggenerated
     */
    int deleteByPrimaryKey(String accessToken);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_access_token
     * @mbggenerated
     */
    int insert(CfgAccessToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_access_token
     * @mbggenerated
     */
    int insertSelective(CfgAccessToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_access_token
     * @mbggenerated
     */
    List<CfgAccessToken> selectByExample(CfgAccessTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_access_token
     * @mbggenerated
     */
    CfgAccessToken selectByPrimaryKey(String accessToken);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_access_token
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CfgAccessToken record, @Param("example") CfgAccessTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_access_token
     * @mbggenerated
     */
    int updateByExample(@Param("record") CfgAccessToken record, @Param("example") CfgAccessTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_access_token
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CfgAccessToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_access_token
     * @mbggenerated
     */
    int updateByPrimaryKey(CfgAccessToken record);
}