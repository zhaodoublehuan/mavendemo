package com.zhh.service;

import com.zhh.entity.DictType;

public interface IDictTypeService {
    int deleteByPrimaryKey(Integer id);

    int insert(DictType record);

    int insertSelective(DictType record);

    DictType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DictType record);

    int updateByPrimaryKey(DictType record);
}
