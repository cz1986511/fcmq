package com.fc.mq.persist.mapper;

import java.util.List;

import com.fc.mq.persist.base.CxInsU2c;

public interface CxInsU2cMapper
{
    int insert(CxInsU2c record);

    int insertSelective(CxInsU2c record);

    List<CxInsU2c> selectByLoanId(String loanId);
}