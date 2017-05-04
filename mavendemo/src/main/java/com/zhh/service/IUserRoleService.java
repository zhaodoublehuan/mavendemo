package com.zhh.service;

import java.util.List;

import com.zhh.entity.UserRole;


/**
* @ClassName: IUserRoleService
* @Description: 用户角色信息service
* @author zhh
* @date 2017-5-4 上午10:29:37
* 
*/

public interface IUserRoleService {
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
	* @Title: selectRolesByLoginNo 
	* @Description: 通过loginNo查询用户所拥有的的角色id集合
	* @param @param userId
	* @param @return    设定文件 
	* @return List<String>    返回类型 
	* @throws 
	*/ 
	public List<String> selectRolesByLoginNo(String loginNo);
}
