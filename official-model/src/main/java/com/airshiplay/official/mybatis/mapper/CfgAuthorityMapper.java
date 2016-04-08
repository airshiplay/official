package com.airshiplay.official.mybatis.mapper;

import com.airshiplay.official.mybatis.model.CfgAuthority;
import com.airshiplay.official.mybatis.model.CfgAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CfgAuthorityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_authority
     *
     * @mbggenerated
     */
    int countByExample(CfgAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_authority
     *
     * @mbggenerated
     */
    int deleteByExample(CfgAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_authority
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_authority
     *
     * @mbggenerated
     */
    int insert(CfgAuthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_authority
     *
     * @mbggenerated
     */
    int insertSelective(CfgAuthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_authority
     *
     * @mbggenerated
     */
    List<CfgAuthority> selectByExample(CfgAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_authority
     *
     * @mbggenerated
     */
    CfgAuthority selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_authority
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CfgAuthority record, @Param("example") CfgAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_authority
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CfgAuthority record, @Param("example") CfgAuthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_authority
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CfgAuthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_authority
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CfgAuthority record);
}