package com.fc.mq.persist.mapper;

import java.util.List;

import com.fc.mq.persist.base.CxInsCbc;

public interface CxInsCbcMapper
{
    int insert(CxInsCbc record);

    int insertSelective(CxInsCbc record);

    List<CxInsCbc> selectByLoanId(String loanId);
}