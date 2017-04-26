package com.zhh.dao;

import com.zhh.entity.Role;

/**
* @ClassName: IRoleDao
* @Description: 角色信息dao
* @author zhh
* @date 2016-8-12 上午9:22:36
* 
*/

public interface IRoleDao {
	
	/** 
	* @Title: add 
	* @Description: 添加新的角色信息
	* @param @param role
	* @param @return    设定文件 
	* @return Role    返回类型 
	* @throws 
	*/ 
	
	Role addRole(Role role);
	
	/** 
	* @Title: update 
	* @Description: 修改角色信息
	* @param @param role
	* @param @return    设定文件 
	* @return Role    返回类型 
	* @throws 
	*/ 
	
	Role updateRole(Role role);
	
	/** 
	* @Title: delete 
	* @Description: 删除角色信息 
	* @param @param role
	* @param @return    设定文件 
	* @return Role    返回类型 
	* @throws 
	*/ 
	
	Role deleteRole(Role role);
}
