package com.airshiplay.official.mybatis.mapper;

import com.airshiplay.official.mybatis.model.CfgCompany;
import com.airshiplay.official.mybatis.model.CfgCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CfgCompanyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_company
     *
     * @mbggenerated
     */
    int countByExample(CfgCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_company
     *
     * @mbggenerated
     */
    int deleteByExample(CfgCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_company
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_company
     *
     * @mbggenerated
     */
    int insert(CfgCompany record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_company
     *
     * @mbggenerated
     */
    int insertSelective(CfgCompany record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_company
     *
     * @mbggenerated
     */
    List<CfgCompany> selectByExample(CfgCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_company
     *
     * @mbggenerated
     */
    CfgCompany selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_company
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CfgCompany record, @Param("example") CfgCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_company
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CfgCompany record, @Param("example") CfgCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_company
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CfgCompany record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg_company
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CfgCompany record);
}