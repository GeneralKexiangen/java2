package com.chuangjin.p2p.sms.dao;

import com.chuangjin.p2p.sms.model.po.SMSLoanPlatform;
import com.chuangjin.p2p.sms.model.po.SMSLoanPlatformExample;
import java.util.List;

public interface SMSLoanPlatformMapper {
    /**
     *
     * @mbggenerated 2019-03-20
     */
    int countByExample(SMSLoanPlatformExample example);

    /**
     *
     * @mbggenerated 2019-03-20
     */
    int insert(SMSLoanPlatform record);

    /**
     *
     * @mbggenerated 2019-03-20
     */
    int insertSelective(SMSLoanPlatform record);

    /**
     *
     * @mbggenerated 2019-03-20
     */
    List<SMSLoanPlatform> selectByExample(SMSLoanPlatformExample example);
}