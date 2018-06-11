package com.zhh.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
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

}