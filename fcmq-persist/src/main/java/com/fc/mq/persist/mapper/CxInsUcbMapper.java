package com.fc.mq.persist.mapper;

import com.fc.mq.persist.base.CxInsUcb;

public interface CxInsUcbMapper
{
    int deleteByPrimaryKey(Integer rowId);

    int insert(CxInsUcb record);

    int insertSelective(CxInsUcb record);

    CxInsUcb selectByLoanId(String loanId);

    int updateByPrimaryKeySelective(CxInsUcb record);

    int updateByPrimaryKey(CxInsUcb record);
}