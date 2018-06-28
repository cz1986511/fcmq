package com.fc.mq.persist.mapper;

import com.fc.mq.persist.base.ProductBase;

public interface ProductBaseMapper
{
    int deleteByPrimaryKey(Long productId);

    int insert(ProductBase record);

    int insertSelective(ProductBase record);

    ProductBase selectByPrimaryKey(Long productId);

    int updateByPrimaryKeySelective(ProductBase record);

    int updateByPrimaryKey(ProductBase record);
}