package com.airshiplay.official.mybatis.mapper;

import com.airshiplay.official.mybatis.model.OfUserTag;
import com.airshiplay.official.mybatis.model.OfUserTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfUserTagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_user_tag
     * @mbggenerated
     */
    int countByExample(OfUserTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_user_tag
     * @mbggenerated
     */
    int deleteByExample(OfUserTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_user_tag
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_user_tag
     * @mbggenerated
     */
    int insert(OfUserTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_user_tag
     * @mbggenerated
     */
    int insertSelective(OfUserTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_user_tag
     * @mbggenerated
     */
    List<OfUserTag> selectByExample(OfUserTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_user_tag
     * @mbggenerated
     */
    OfUserTag selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_user_tag
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") OfUserTag record, @Param("example") OfUserTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_user_tag
     * @mbggenerated
     */
    int updateByExample(@Param("record") OfUserTag record, @Param("example") OfUserTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_user_tag
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OfUserTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table of_user_tag
     * @mbggenerated
     */
    int updateByPrimaryKey(OfUserTag record);
}