package com.airshiplay.official.mybatis.mapper;

import com.airshiplay.official.mybatis.model.OfRole;
import com.airshiplay.official.mybatis.model.OfRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_role
     * @mbggenerated
     */
    int countByExample(OfRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_role
     * @mbggenerated
     */
    int deleteByExample(OfRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_role
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_role
     * @mbggenerated
     */
    int insert(OfRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_role
     * @mbggenerated
     */
    int insertSelective(OfRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_role
     * @mbggenerated
     */
    List<OfRole> selectByExample(OfRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_role
     * @mbggenerated
     */
    OfRole selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_role
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") OfRole record, @Param("example") OfRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_role
     * @mbggenerated
     */
    int updateByExample(@Param("record") OfRole record, @Param("example") OfRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_role
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OfRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_role
     * @mbggenerated
     */
    int updateByPrimaryKey(OfRole record);
}