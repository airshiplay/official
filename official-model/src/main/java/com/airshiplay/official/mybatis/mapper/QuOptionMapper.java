package com.airshiplay.official.mybatis.mapper;

import com.airshiplay.official.mybatis.model.QuOption;
import com.airshiplay.official.mybatis.model.QuOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuOptionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qu_option
     * @mbggenerated
     */
    int countByExample(QuOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qu_option
     * @mbggenerated
     */
    int deleteByExample(QuOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qu_option
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qu_option
     * @mbggenerated
     */
    int insert(QuOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qu_option
     * @mbggenerated
     */
    int insertSelective(QuOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qu_option
     * @mbggenerated
     */
    List<QuOption> selectByExample(QuOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qu_option
     * @mbggenerated
     */
    QuOption selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qu_option
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") QuOption record, @Param("example") QuOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qu_option
     * @mbggenerated
     */
    int updateByExample(@Param("record") QuOption record, @Param("example") QuOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qu_option
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(QuOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qu_option
     * @mbggenerated
     */
    int updateByPrimaryKey(QuOption record);
}