package com.fc.mq.persist.mapper;

import com.fc.mq.persist.base.CxInsU2b;

public interface CxInsU2bMapper
{
    int insert(CxInsU2b record);

    int insertSelective(CxInsU2b record);

    CxInsU2b selectByLoanId(String loanId);
}