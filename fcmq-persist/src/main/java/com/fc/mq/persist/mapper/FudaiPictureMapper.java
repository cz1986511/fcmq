package com.fc.mq.persist.mapper;

import java.util.List;
import java.util.Map;

import com.fc.mq.persist.base.FudaiPicture;

public interface FudaiPictureMapper
{
    int deleteByPrimaryKey(Long id);

    int deleteByFdId(String fdId);

    int insert(FudaiPicture record);

    int insertSelective(FudaiPicture record);

    FudaiPicture selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FudaiPicture record);

    int updateByPrimaryKey(FudaiPicture record);

    List<FudaiPicture> selectByParams(Map<String, Object> map);
}