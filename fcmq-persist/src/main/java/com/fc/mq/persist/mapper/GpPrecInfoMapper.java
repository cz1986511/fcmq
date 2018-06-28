package com.fc.mq.persist.mapper;

import com.fc.mq.persist.base.GpPrecInfo;

public interface GpPrecInfoMapper
{
    int deleteByPrimaryKey(Long id);

    int insert(GpPrecInfo gpPrecInfo);

    int insertSelective(GpPrecInfo gpPrecInfo);

    GpPrecInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GpPrecInfo gpPrecInfo);

    int updateByPrimaryKey(GpPrecInfo gpPrecInfo);
}