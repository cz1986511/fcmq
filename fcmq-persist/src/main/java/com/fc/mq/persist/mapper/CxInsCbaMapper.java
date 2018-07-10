package com.fc.mq.persist.mapper;

import com.fc.mq.persist.base.CxInsCba;

public interface CxInsCbaMapper {
    int insert(CxInsCba record);

    int insertSelective(CxInsCba record);
}