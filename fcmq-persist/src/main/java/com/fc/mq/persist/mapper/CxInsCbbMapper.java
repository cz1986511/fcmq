package com.fc.mq.persist.mapper;

import com.fc.mq.persist.base.CxInsCbb;

public interface CxInsCbbMapper
{
    int insert(CxInsCbb record);

    int insertSelective(CxInsCbb record);

    CxInsCbb selectByLoanId(String loanId);
}