package com.fc.mq.persist.mapper;

import java.util.List;
import java.util.Map;

import com.fc.mq.persist.base.FudaiSubscribe;

public interface FudaiSubscribeMapper
{
    int deleteByFdIdAndUserId(FudaiSubscribe fudaiSubscribe);

    int insert(FudaiSubscribe fudaiSubscribe);

    int insertSelective(FudaiSubscribe fudaiSubscribe);

    FudaiSubscribe selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FudaiSubscribe fudaiSubscribe);

    int updateByPrimaryKey(FudaiSubscribe fudaiSubscribe);

    List<FudaiSubscribe> selectByParams(Map<String, Object> map);
}