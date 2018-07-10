package com.fc.mq.persist.mapper;

import com.fc.mq.persist.base.CxInsU2a;

public interface CxInsU2aMapper {
    int insert(CxInsU2a record);

    int insertSelective(CxInsU2a record);
}