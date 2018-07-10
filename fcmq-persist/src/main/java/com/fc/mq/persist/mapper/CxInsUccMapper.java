package com.fc.mq.persist.mapper;

import com.fc.mq.persist.base.CxInsUcc;

public interface CxInsUccMapper {
    int deleteByPrimaryKey(Integer rowId);

    int insert(CxInsUcc record);

    int insertSelective(CxInsUcc record);

    CxInsUcc selectByPrimaryKey(Integer rowId);

    int updateByPrimaryKeySelective(CxInsUcc record);

    int updateByPrimaryKey(CxInsUcc record);
}