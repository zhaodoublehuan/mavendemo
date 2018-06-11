package com.zhh.entity;
/*
CREATE TABLE `sys_role` (
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
import java.util.HashSet;
import java.util.Set;

/**
* @ClassName: Role
* @Description: 角色实体类
* @author zhh
* @date 2016-8-12 上午9:15:54
* 
*/
@Getter
@Setter
public class Role implements Serializable {
	
	private static final long serialVersionUID = -4987248128309954399L;

	/**
	* @Fields id : 主键
	*/
	private String id;
	
	/**
	* @Fields name : 角色名称
	*/
	private String name;
	
	/**
	* @Fields description : 角色描述
	*/
	private String description;
	/**
	 * 角色状态
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
	  
	/**
	* @Fields permissionSet : 角色拥有的权限集合
	*/
	private Set<Permission> permissionSet = new HashSet<Permission>();

}
