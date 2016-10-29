package com.dzmsoft.sms.base.dao;

import com.dzmsoft.sms.base.pojo.SmsOrderEvaluation;
import com.dzmsoft.sms.base.pojo.SmsOrderEvaluationExample;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SmsOrderEvaluationMapper {
    public PageList<SmsOrderEvaluation> selectByExample(SmsOrderEvaluationExample example,PageBounds pageBounds);
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_evaluation
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    int countByExample(SmsOrderEvaluationExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_evaluation
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    int deleteByExample(SmsOrderEvaluationExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_evaluation
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_evaluation
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    int insert(SmsOrderEvaluation record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_evaluation
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    int insertSelective(SmsOrderEvaluation record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_evaluation
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    List<SmsOrderEvaluation> selectByExample(SmsOrderEvaluationExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_evaluation
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    SmsOrderEvaluation selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_evaluation
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    int updateByExampleSelective(@Param("record") SmsOrderEvaluation record,
            @Param("example") SmsOrderEvaluationExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_evaluation
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    int updateByExample(@Param("record") SmsOrderEvaluation record,
            @Param("example") SmsOrderEvaluationExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_evaluation
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    int updateByPrimaryKeySelective(SmsOrderEvaluation record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_evaluation
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    int updateByPrimaryKey(SmsOrderEvaluation record);
}