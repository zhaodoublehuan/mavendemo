package com.zhh.service;

import com.zhh.dao.IDictTypeDao;
import com.zhh.entity.DictType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictTypeService {

    @Autowired
    private IDictTypeDao dictTypeDao;
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(DictType record) {
        return 0;
    }

    public int insertSelective(DictType record) {
        return 0;
    }

    public DictType selectByPrimaryKey(Integer id) {
        return null;
    }

    public int updateByPrimaryKeySelective(DictType record) {
        return 0;
    }

    public int updateByPrimaryKey(DictType record) {
        return 0;
    }
}
