package com.zhh.service;

import com.zhh.dao.IDictDataDao;
import com.zhh.entity.DictData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictDataService{

    @Autowired
    private IDictDataDao dictDataDao;

    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(DictData record) {
        return 0;
    }

    public int insertSelective(DictData record) {
        return 0;
    }

    public DictData selectByPrimaryKey(Integer id) {
        return null;
    }

    public int updateByPrimaryKeySelective(DictData record) {
        return 0;
    }

    public int updateByPrimaryKey(DictData record) {
        return 0;
    }
}
