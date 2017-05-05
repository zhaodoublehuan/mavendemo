package com.zhh.entity;

import java.util.Date;

public class RoleMenu {
	
	private String menuId;
	
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

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
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

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

}
