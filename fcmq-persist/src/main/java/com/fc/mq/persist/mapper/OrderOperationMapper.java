package com.fc.mq.persist.mapper;

import com.fc.mq.persist.base.OrderOperation;

public interface OrderOperationMapper
{
    int deleteByPrimaryKey(Long id);

    int insert(OrderOperation record);

    int insertSelective(OrderOperation record);

    OrderOperation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderOperation record);

    int updateByPrimaryKey(OrderOperation record);
}