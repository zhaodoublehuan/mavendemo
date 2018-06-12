package com.zhh.dao;

import com.zhh.entity.ProductRecord;
import com.zhh.entity.ProductShop;
import com.zhh.util.PageUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IProductRecordDao {

    List<ProductRecord> selectRecordListPage(@Param("record") ProductRecord record, @Param("page") PageUtil page);

    int selectRecordCount(ProductRecord record);
}