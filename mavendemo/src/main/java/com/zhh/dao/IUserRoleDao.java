package com.zhh.dao;

import java.util.List;

import com.zhh.entity.UserRole;

public interface IUserRoleDao {
	/** 
	* @Title: addUserRole 
	* @Description: 添加用户角色对应关系
	* @param @param userRole
	* @param @return    设定文件 
	* @return UserRole    返回类型 
	* @throws 
	*/ 
	
	public UserRole addUserRole(UserRole userRole);
	
	/** 
	* @Title: deleteUserRole 
	* @Description: 删除用户角色关系 
	* @param @param userRole
	* @param @return    设定文件 
	* @return boolean    返回类型 
	* @throws 
	*/ 
	
	public boolean deleteUserRole(UserRole userRole);

	/** 
	* @Title: getRolesByUserId 
	* @Description: 通过用户id查询用户所拥有的角色集合
	* @param @param userId
	* @param @return    设定文件 
	* @return List<String>    返回类型 
	* @throws 
	*/ 
	
	public List<String> getRolesByUserId(String userId);
}
