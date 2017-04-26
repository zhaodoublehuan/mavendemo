package com.zhh.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhh.dao.IRoleDao;
import com.zhh.entity.Role;
import com.zhh.service.IRoleService;

/**
* @ClassName: RoleService
* @Description: TODO(这里用一句话描述这个类的作用)
* @author zhh
* @date 2016-8-12 上午9:20:46
* 
*/
@SuppressWarnings("restriction")
@Service
public class RoleService implements IRoleService {
	/**
	* @Fields roleDao : dao注入
	*/
	@Resource
	private IRoleDao roleDao;
	/* (非 Javadoc) 
	* <p>Title: add</p> 
	* <p>Description: </p> 
	* @param role
	* @return 
	* @see com.zhh.service.IRoleService#add(com.zhh.entity.Role) 
	*/ 
	
	public Role addRole(Role role) {
		return roleDao.addRole(role);
	}

	/* (非 Javadoc) 
	* <p>Title: update</p> 
	* <p>Description: </p> 
	* @param role
	* @return 
	* @see com.zhh.service.IRoleService#update(com.zhh.entity.Role) 
	*/ 
	
	public Role updateRole(Role role) {
		return roleDao.updateRole(role);
	}

	/* (非 Javadoc) 
	* <p>Title: delete</p> 
	* <p>Description: </p> 
	* @param role
	* @return 
	* @see com.zhh.service.IRoleService#delete(com.zhh.entity.Role) 
	*/ 
	
	public Role deleteRole(Role role) {
		return roleDao.deleteRole(role);
	}

}
