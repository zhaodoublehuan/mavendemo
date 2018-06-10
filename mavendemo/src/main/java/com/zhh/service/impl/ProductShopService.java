package com.zhh.service.impl;

import com.zhh.dao.IProductShopDao;
import com.zhh.entity.Product;
import com.zhh.entity.ProductShop;
import com.zhh.service.IProductShopService;
import com.zhh.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductShopService implements IProductShopService {

    @Autowired
    private IProductShopDao productShopDao;

    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(ProductShop record) {
        return 0;
    }

    public int insertSelective(ProductShop record) {
        return 0;
    }

    public ProductShop selectByPrimaryKey(Integer id) {
        return null;
    }

    public int updateByPrimaryKeySelective(ProductShop record) {
        return 0;
    }

    public int updateByPrimaryKey(ProductShop record) {
        return 0;
    }

    public List<ProductShop> selectShopListPage(ProductShop record, PageUtil page) {
        return productShopDao.selectShopListPage(record,page);
    }

    public int selectShopCount(ProductShop record) {
        return productShopDao.selectShopCount(record);
    }
}
