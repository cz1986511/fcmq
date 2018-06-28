package com.fc.mq.persist.mapper;

import java.util.List;
import java.util.Map;

import com.fc.mq.persist.base.FudaiInfo;

public interface FudaiInfoMapper
{
    int deleteByPrimaryKey(Long id);

    int deleteByFdId(String fdId);

    int insert(FudaiInfo fudaiInfo);

    int insertSelective(FudaiInfo fudaiInfo);

    FudaiInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FudaiInfo fudaiInfo);

    List<FudaiInfo> selectByParams(Map<String, Object> map);

}