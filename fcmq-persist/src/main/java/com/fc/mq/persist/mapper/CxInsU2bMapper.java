package com.fc.mq.persist.mapper;

import java.util.List;

import com.fc.mq.persist.base.CxInsU2b;

public interface CxInsU2bMapper
{
    int insert(CxInsU2b record);

    int insertSelective(CxInsU2b record);

    List<CxInsU2b> selectByLoanId(String loanId);
}