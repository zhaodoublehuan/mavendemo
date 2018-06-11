package com.zhh.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/*
CREATE TABLE `sys_user_role` (
`user_id` varchar(50) NOT NULL,
`role_id` varchar(50) NOT NULL,
`insert_date` datetime DEFAULT NULL,
`update_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
*/
/**
* @ClassName: UserRole
* @Description: 用户角色实体
* @author zhh
* @date 2016-8-12 上午9:14:37
* 
*/
@Getter
@Setter
public class UserRole {

	/**
	* @Fields userId : 用户id

	*/
	private String loginNo;
	
	/**
	* @Fields roleId : 角色id
	*/
	private String roleId;
	
	/**
	* @Fields active : 使用状态
	*/
	private String active;
	
	/**
	* @Fields insertDate : 插入时间
	*/
	private Date insertDate;
	
	/**
	* @Fields updateDate : 修改时间
	*/
	private Date updateDate;

}
