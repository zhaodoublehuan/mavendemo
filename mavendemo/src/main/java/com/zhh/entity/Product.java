package com.zhh.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private Integer id;

    private String name;

    private String remark;

    private BigDecimal price;

    private DictData unitData;

    private DictData productType;

    private ProductShop productShop;

    private Date insertDate;

    private Date updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public DictData getUnitData() {
        return unitData;
    }

    public void setUnitData(DictData unitData) {
        this.unitData = unitData;
    }

    public ProductShop getProductShop() {
        return productShop;
    }

    public void setProductShop(ProductShop productShop) {
        this.productShop = productShop;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }


    public DictData getProductType() {
        return productType;
    }

    public void setProductType(DictData productType) {
        this.productType = productType;
    }

}