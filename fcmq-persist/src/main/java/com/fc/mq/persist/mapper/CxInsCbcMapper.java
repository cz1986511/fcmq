package com.fc.mq.persist.mapper;

import com.fc.mq.persist.base.CxInsCbc;

public interface CxInsCbcMapper {
    int insert(CxInsCbc record);

    int insertSelective(CxInsCbc record);
}