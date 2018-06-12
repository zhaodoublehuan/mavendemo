package com.zhh.service;

import com.alibaba.fastjson.JSON;
import com.zhh.base.BaseTest;
import com.zhh.entity.ProductShop;
import com.zhh.service.ProductShopService;
import com.zhh.util.PageUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductShopServiceTest extends BaseTest {

    @Autowired
    private ProductShopService productShopService;

    @Test
    public void selectShopListPage() {
        PageUtil page = new PageUtil();
        page.setRecordStart(0);
        page.setPageSize(10);
        List<ProductShop> products =productShopService.selectShopListPage(null,page);
        System.out.print(JSON.toJSONString(products));
    }

    @Test
    public void selectShopCount() {
        int count = productShopService.selectShopCount(null);
        System.out.print(count);
    }
}