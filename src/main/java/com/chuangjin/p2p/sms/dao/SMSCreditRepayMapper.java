package com.chuangjin.p2p.sms.dao;

import com.chuangjin.p2p.sms.model.po.SMSCreditRepay;
import com.chuangjin.p2p.sms.model.po.SMSCreditRepayExample;
import java.util.List;

public interface SMSCreditRepayMapper {
    /**
     *
     * @mbggenerated 2019-03-18
     */
    int countByExample(SMSCreditRepayExample example);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insert(SMSCreditRepay record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    int insertSelective(SMSCreditRepay record);

    /**
     *
     * @mbggenerated 2019-03-18
     */
    List<SMSCreditRepay> selectByExample(SMSCreditRepayExample example);
}