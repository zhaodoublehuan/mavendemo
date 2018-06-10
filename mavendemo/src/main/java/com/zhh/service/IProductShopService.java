package com.zhh.service;

import com.zhh.entity.Product;
import com.zhh.entity.ProductShop;
import com.zhh.util.PageUtil;

import java.util.List;

public interface IProductShopService {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductShop record);

    int insertSelective(ProductShop record);

    ProductShop selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductShop record);

    int updateByPrimaryKey(ProductShop record);

    List<ProductShop> selectShopListPage(ProductShop record, PageUtil page);

    int selectShopCount(ProductShop record);
}
