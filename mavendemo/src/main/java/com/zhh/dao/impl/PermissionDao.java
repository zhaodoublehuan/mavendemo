package com.zhh.dao.impl;

import org.springframework.stereotype.Repository;

import com.zhh.dao.IPermissionDao;
import com.zhh.entity.Permission;

/**
* @ClassName: PermissionDao
* @Description: 权限管理dao实现
* @author zhh
* @date 2016-8-12 上午9:49:12
* 
*/
@Repository	
public class PermissionDao extends BaseDao implements IPermissionDao {
	
	private static final String NAME_SPACE = "com.zhh.entity.Permission";

	/* (非 Javadoc) 
	* <p>Title: addPermision</p> 
	* <p>Description: </p> 
	* @param permission
	* @return 
	* @see com.zhh.dao.IPermissionDao#addPermision(com.zhh.entity.Permission) 
	*/ 
	
	public Permission addPermision(Permission permission) {
		int result = this.getSqlSession().insert(NAME_SPACE+".insertSelective",permission);
		return result>0?permission:null;
	}

	/* (非 Javadoc) 
	* <p>Title: updatePermission</p> 
	* <p>Description: </p> 
	* @param permission
	* @return 
	* @see com.zhh.dao.IPermissionDao#updatePermission(com.zhh.entity.Permission) 
	*/ 
	
	public Permission updatePermission(Permission permission) {
		int result = this.getSqlSession().update(NAME_SPACE+".updateByPrimaryKeySelective", permission);
		return result>0?permission:null;
	}

	/* (非 Javadoc) 
	* <p>Title: deletePermission</p> 
	* <p>Description: </p> 
	* @param permission
	* @return 
	* @see com.zhh.dao.IPermissionDao#deletePermission(com.zhh.entity.Permission) 
	*/ 
	
	public Permission deletePermission(Permission permission) {
		String id = permission.getId();
		int result = this.getSqlSession().delete(NAME_SPACE+".deleteByPrimaryKey", id);
		return result>0?permission:null;
	}

}
