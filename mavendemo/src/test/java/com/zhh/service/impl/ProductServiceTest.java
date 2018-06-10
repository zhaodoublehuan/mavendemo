package com.zhh.service.impl;

import com.alibaba.fastjson.JSON;
import com.zhh.base.BaseTest;
import com.zhh.entity.Product;
import com.zhh.service.IProductService;
import com.zhh.util.PageUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ProductServiceTest extends BaseTest {

    @Autowired
    private IProductService productService;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        Product record = new Product();
        record.setName("测试产品");
        productService.insert(record);
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void selectProductListPage() {
        PageUtil page = new PageUtil();
        page.setRecordStart(0);
        page.setPageSize(10);
        List<Product> products =productService.selectProductListPage(null,page);
        System.out.print(JSON.toJSONString(products));
    }

    @Test
    public void selectProductCount() {
        int count = productService.selectProductCount(null);
        System.out.print(count);
    }
}