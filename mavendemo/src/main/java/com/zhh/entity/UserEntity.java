package com.zhh.entity;
/*
CREATE TABLE `sys_user` (
`id` varchar(50) NOT NULL ,
`user_name` varchar(50) DEFAULT NULL COMMENT '姓名',
`password` varchar(32) DEFAULT NULL,
`mobile` varchar(16) DEFAULT NULL COMMENT '手机',
`email` varchar(50) DEFAULT NULL COMMENT '邮箱',
`active` varchar(10) DEFAULT NULL COMMENT '用户状态',
`insert_date` datetime DEFAULT NULL,
`update_date` datetime DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
*/
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
* @ClassName: UserEntity
* @Description: 用户信息实体类
* @author zhh
* @date 2016-8-12 上午9:16:13
* 
*/
@Getter
@Setter
public class UserEntity {
    /**
    * @Fields id : 主键id
    */
    private String id;
    /**
     * @Fields loginNo : 登录账号
     */
    private String loginNo;
    /**
    * @Fields userName : 用户账号
    */
    private String userName;
    /**
     * @Fields salt : 加密用的盐
     */
    private String salt;

    /**
    * @Fields password : 密码
    */
    private String password;

    /**
    * @Fields mobile : 手机号
    */
    private String mobile;

    /**
    * @Fields email : 邮箱
    */
    private String email;
    
    /**
    * @Fields active : 用户状态
    */
    private String active;

    /**
    * @Fields insertDate : 新建时间
    */
    private Date insertDate;

    /**
    * @Fields updateDate : 修改时间
    */
    private Date updateDate;

}