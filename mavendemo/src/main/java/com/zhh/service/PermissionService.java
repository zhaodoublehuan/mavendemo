package com.zhh.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhh.dao.IPermissionDao;
import com.zhh.entity.Permission;

/**
* @ClassName: PermissionService
* @Description: 权限管理service实现
* @author zhh
* @date 2016-8-12 上午9:52:14
* 
*/
@SuppressWarnings("restriction")
@Service
public class PermissionService {
	/**
	* @Fields permissionDao : dao层注入
	*/
	@Resource
	private IPermissionDao permissionDao;
	/* (非 Javadoc) 
	* <p>Title: addPermision</p> 
	* <p>Description: </p> 
	* @param permission
	* @return 
	* @see com.zhh.service.IPermissionService#addPermision(com.zhh.entity.Permission) 
	*/ 
	
	public Permission addPermision(Permission permission) {
		return permissionDao.addPermision(permission);
	}

	/* (非 Javadoc) 
	* <p>Title: updatePermission</p> 
	* <p>Description: </p> 
	* @param permission
	* @return 
	* @see com.zhh.service.IPermissionService#updatePermission(com.zhh.entity.Permission) 
	*/ 
	
	public Permission updatePermission(Permission permission) {
		return permissionDao.updatePermission(permission);
	}

	/* (非 Javadoc) 
	* <p>Title: deletePermission</p> 
	* <p>Description: </p> 
	* @param permission
	* @return 
	* @see com.zhh.service.IPermissionService#deletePermission(com.zhh.entity.Permission) 
	*/ 
	
	public Permission deletePermission(Permission permission) {
		return permissionDao.deletePermission(permission);
	}

}
