package com.zhh.service;

import java.util.List;

import com.zhh.entity.Role;

/**
* @ClassName: IRoleService
* @Description: 角色信息service
* @author zhh
* @date 2016-8-12 上午9:18:41
* 
*/

public interface IRoleService {
	
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
	
	boolean deleteRole(String roleId);
	/**
	 * 根据登录账号查询对应的角色信息
	 * @param userId
	 * @return
	 */
	List<Role> selectRolesByLoginNo(String loginNo);
}
