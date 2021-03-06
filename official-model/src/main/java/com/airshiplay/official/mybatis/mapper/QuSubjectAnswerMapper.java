package com.airshiplay.official.mybatis.mapper;

import com.airshiplay.official.mybatis.model.QuSubjectAnswer;
import com.airshiplay.official.mybatis.model.QuSubjectAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuSubjectAnswerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qu_subject_answer
     * @mbggenerated
     */
    int countByExample(QuSubjectAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qu_subject_answer
     * @mbggenerated
     */
    int deleteByExample(QuSubjectAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qu_subject_answer
     * @mbggenerated
     */
    int insert(QuSubjectAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qu_subject_answer
     * @mbggenerated
     */
    int insertSelective(QuSubjectAnswer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qu_subject_answer
     * @mbggenerated
     */
    List<QuSubjectAnswer> selectByExample(QuSubjectAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qu_subject_answer
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") QuSubjectAnswer record, @Param("example") QuSubjectAnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table qu_subject_answer
     * @mbggenerated
     */
    int updateByExample(@Param("record") QuSubjectAnswer record, @Param("example") QuSubjectAnswerExample example);
}