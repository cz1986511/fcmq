package com.fc.mq.persist.mapper;

import com.fc.mq.persist.base.CategoryBase;

public interface CategoryBaseMapper
{
    int deleteByPrimaryKey(Long categoryId);

    int insert(CategoryBase record);

    int insertSelective(CategoryBase record);

    CategoryBase selectByPrimaryKey(Long categoryId);

    int updateByPrimaryKeySelective(CategoryBase record);

    int updateByPrimaryKey(CategoryBase record);
}