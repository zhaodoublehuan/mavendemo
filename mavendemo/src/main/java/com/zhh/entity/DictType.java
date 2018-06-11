package com.zhh.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class DictType {
    private Integer id;

    private String name;

    private String remark;

    private Integer seq;

    private Date insertDate;

    private Date updateDate;

}