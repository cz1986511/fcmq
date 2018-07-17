package com.fc.mq.persist.mapper;

import java.util.List;

import com.fc.mq.persist.base.CxInsCba;

public interface CxInsCbaMapper
{
    int insert(CxInsCba record);

    int insertSelective(CxInsCba record);

    List<CxInsCba> selectByLoanId(String loanId);
}