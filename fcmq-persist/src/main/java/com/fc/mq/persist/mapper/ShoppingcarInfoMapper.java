package com.fc.mq.persist.mapper;

import java.util.List;
import java.util.Map;

import com.fc.mq.persist.base.ShoppingcarInfo;

public interface ShoppingcarInfoMapper
{
    int deleteByPrimaryKey(Long id);

    int deleteShoppingcarInfo(ShoppingcarInfo shoppingcarInfo);

    int insert(ShoppingcarInfo shoppingcarInfo);

    int insertSelective(ShoppingcarInfo shoppingcarInfo);

    ShoppingcarInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ShoppingcarInfo shoppingcarInfo);

    int updateByPrimaryKey(ShoppingcarInfo shoppingcarInfo);

    List<ShoppingcarInfo> selectByParams(Map<String, Object> map);
}