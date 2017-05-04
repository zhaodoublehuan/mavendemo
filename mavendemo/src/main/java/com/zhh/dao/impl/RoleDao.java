package com.zhh.dao.impl;

import org.springframework.stereotype.Repository;

import com.zhh.dao.IRoleDao;
import com.zhh.entity.Role;
@Repository	
public class RoleDao extends BaseDao implements IRoleDao {
	
	private static final String NAME_SPACE = "com.zhh.entity.Role";

	/* (非 Javadoc) 
	* <p>Title: add</p> 
	* <p>Description: </p> 
	* @param role
	* @return 
	* @see com.zhh.dao.IRoleDao#add(com.zhh.entity.Role) 
	*/ 
	
	public Role addRole(Role role) {
		int result = this.getSqlSession().insert(NAME_SPACE+".insertSelective",role);
		return result>0 ? role : null;
	}

	/* (非 Javadoc) 
	* <p>Title: update</p> 
	* <p>Description: </p> 
	* @param role
	* @return 
	* @see com.zhh.dao.IRoleDao#update(com.zhh.entity.Role) 
	*/ 
	
	public Role updateRole(Role role) {
		int result = this.getSqlSession().update(NAME_SPACE+".updateByPrimaryKeySelective",role);
		return result>0 ? role : null;
	}

	/* (非 Javadoc) 
	* <p>Title: delete</p> 
	* <p>Description: </p> 
	* @param role
	* @return 
	* @see com.zhh.dao.IRoleDao#delete(com.zhh.entity.Role) 
	*/ 
	
	public boolean deleteRole(String roleId) {
		int result = this.getSqlSession().delete(NAME_SPACE+".deleteRoleById",roleId);
		return result>0 ? true : false;
	}

}
