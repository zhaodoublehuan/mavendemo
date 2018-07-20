package com.zhh.service;

import com.zhh.base.BaseTest;
import com.zhh.condition.DictDataCondition;
import com.zhh.entity.DictData;
import com.zhh.util.PageUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class DictDataServiceTest extends BaseTest {

    @Autowired
    private DictDataService dictDataService;

    @Test
    public void selectPageCountByCondition() {
        DictDataCondition condition = new DictDataCondition();
        condition.setTypeName("测试");
        int count = dictDataService.selectPageCountByCondition(condition);
        System.out.print(count);
    }

    @Test
    public void selectPageList() {
        DictDataCondition condition = new DictDataCondition();
        condition.setTypeName("测试");
        PageUtil page = new PageUtil();
        page.setRecordStart(0);
        page.setPageSize(10);
        List<DictData> list = dictDataService.selectPageList(condition,page);
        System.out.print(list);
    }
}