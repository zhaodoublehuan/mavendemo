package com.zhh.service;

import com.zhh.entity.Product;
import com.zhh.util.PageUtil;

import java.util.List;

public interface IProductService {

    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> selectProductListPage(Product record, PageUtil page);

    int selectProductCount(Product record);
}
