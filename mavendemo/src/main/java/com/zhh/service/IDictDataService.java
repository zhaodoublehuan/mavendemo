package com.zhh.service;

import com.zhh.entity.DictData;

public interface IDictDataService {
    int deleteByPrimaryKey(Integer id);

    int insert(DictData record);

    int insertSelective(DictData record);

    DictData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictData record);

    int updateByPrimaryKey(DictData record);
}
