package com.fc.mq.persist.mapper;

import java.util.List;

import com.fc.mq.persist.base.CxInsUser2;

public interface CxInsUser2Mapper
{
    int insert(CxInsUser2 record);

    int insertSelective(CxInsUser2 record);

    List<CxInsUser2> selectByLoanId(String loanId);
}