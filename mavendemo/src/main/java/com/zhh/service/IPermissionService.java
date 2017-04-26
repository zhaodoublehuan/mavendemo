package com.zhh.service;

import com.zhh.entity.Permission;

/**
* @ClassName: IPermisssion
* @Description: 权限管理service
* @author zhh
* @date 2016-8-12 上午9:43:39
* 
*/

public interface IPermissionService {

	/** 
	* @Title: addPermision 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @return Permission    返回类型 
	* @throws 
	*/ 
	
	Permission addPermision(Permission permission);
	
	/** 
	* @Title: updatePermission 
	* @Description: 修改权限信息
	* @param @param permission
	* @param @return    设定文件 
	* @return Permission    返回类型 
	* @throws 
	*/ 
	
	Permission updatePermission(Permission permission);
	
	/** 
	* @Title: deletePermission 
	* @Description: 删除权限信息
	* @param @param permission
	* @param @return    设定文件 
	* @return Permission    返回类型 
	* @throws 
	*/ 
	
	Permission deletePermission(Permission permission);
}
