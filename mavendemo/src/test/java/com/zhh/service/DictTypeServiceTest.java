package com.zhh.service;

import com.zhh.base.BaseTest;
import com.zhh.entity.DictType;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;

public class DictTypeServiceTest extends BaseTest {

    @Autowired
    private DictTypeService dictTypeService;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        DictType dictType = new DictType();
        dictType.setName("测试字典类型");
        dictType.setSeq(0);
        dictType.setRemark("单元测试数据");
        dictTypeService.insert(dictType);
    }

    @Test
    public void selectByPrimaryKey() {
        DictType dictType = dictTypeService.selectByPrimaryKey(3);
        System.out.print(dictType.toString());
    }

    @Test
    public void updateByPrimaryKeySelective() {
        DictType dictType = new DictType();
        dictType.setId(3);
        dictType.setName("测试字典类型");
        dictType.setSeq(0);
        dictType.setRemark("单元测试数据修改");
        dictTypeService.updateByPrimaryKeySelective(dictType);
    }
}