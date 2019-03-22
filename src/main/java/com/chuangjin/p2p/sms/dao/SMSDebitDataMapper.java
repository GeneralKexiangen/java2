package com.chuangjin.p2p.sms.dao;

import com.chuangjin.p2p.sms.model.po.SMSDebitData;
import com.chuangjin.p2p.sms.model.po.SMSDebitDataExample;
import java.util.List;

public interface SMSDebitDataMapper {
    /**
     *
     * @mbggenerated 2019-03-19
     */
    int countByExample(SMSDebitDataExample example);

    /**
     *
     * @mbggenerated 2019-03-19
     */
    int insert(SMSDebitData record);

    /**
     *
     * @mbggenerated 2019-03-19
     */
    int insertSelective(SMSDebitData record);

    /**
     *
     * @mbggenerated 2019-03-19
     */
    List<SMSDebitData> selectByExample(SMSDebitDataExample example);
}