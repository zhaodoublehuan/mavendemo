package com.zhh.service;

import com.zhh.dao.IProductRecordDao;
import com.zhh.entity.ProductRecord;
import com.zhh.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductRecordService {

    @Autowired
    private IProductRecordDao productRecordDao;

    public List<ProductRecord> selectRecordListPage(ProductRecord record, PageUtil page) {
        return  productRecordDao.selectRecordListPage(record,page);
    }

    public int selectRecordCount(ProductRecord record) {
        return productRecordDao.selectRecordCount(record);
    }
}
