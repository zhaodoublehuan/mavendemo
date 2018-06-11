package com.zhh.entity;
/*
CREATE TABLE `sys_permission` (
`id` varchar(50) NOT NULL,
`name` varchar(32) NOT NULL COMMENT '名称',
`description` varchar(256) DEFAULT NULL COMMENT '描述',
`insert_date` datetime DEFAULT NULL,
`update_date` datetime DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
*/
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
* @ClassName: Permission
* @Description: 权限实体类
* @author zhh
* @date 2016-8-12 上午9:16:33
* 
*/
@Getter
@Setter
public class Permission implements Serializable{
	
	private static final long serialVersionUID = -8025597823572680802L;

	/**
	* @Fields id : 主键
	*/
	private String id;
	
	/**
	* @Fields name : 权限名称
	*/
	private String name;
	  
	/**
	* @Fields description : 权限描述
	*/
	private String description;
	
	/**
	* @Fields insertDate : 插入时间
	*/
	private Date insertDate;
	
	/**
	* @Fields updateDate : 修改时间
	*/
	private Date updateDate;

}
