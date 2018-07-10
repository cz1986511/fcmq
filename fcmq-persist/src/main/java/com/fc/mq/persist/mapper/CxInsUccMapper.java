package com.fc.mq.persist.mapper;

import com.fc.mq.persist.base.CxInsUcc;

public interface CxInsUccMapper
{

    int insert(CxInsUcc record);

    int insertSelective(CxInsUcc record);

    CxInsUcc selectByLoanId(String loanId);

    int updateByPrimaryKeySelective(CxInsUcc record);

    int updateByPrimaryKey(CxInsUcc record);
}