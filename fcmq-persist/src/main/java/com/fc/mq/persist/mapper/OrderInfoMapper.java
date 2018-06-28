package com.fc.mq.persist.mapper;

import java.util.List;
import java.util.Map;

import com.fc.mq.persist.base.OrderInfo;

public interface OrderInfoMapper
{
    int deleteByPrimaryKey(Long id);

    int insert(OrderInfo orderInfo);

    int insertSelective(OrderInfo orderInfo);

    OrderInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderInfo orderInfo);

    List<OrderInfo> selectByParams(Map<String, Object> map);

}