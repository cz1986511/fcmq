package com.fc.mq.persist.mapper;

import java.util.List;

import com.fc.mq.persist.base.CxInsCbb;

public interface CxInsCbbMapper
{
    int insert(CxInsCbb record);

    int insertSelective(CxInsCbb record);

    List<CxInsCbb> selectByLoanId(String loanId);
}