package com.fc.mq.persist.mapper;

import java.util.List;
import java.util.Map;

import com.fc.mq.persist.base.FudaiItem;

public interface FudaiItemMapper
{
    int deleteByParams(Map<String, Object> map);

    int insert(FudaiItem fudaiItem);

    int insertSelective(FudaiItem fudaiItem);

    FudaiItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FudaiItem fudaiItem);

    List<FudaiItem> selectByParams(Map<String, Object> map);
}