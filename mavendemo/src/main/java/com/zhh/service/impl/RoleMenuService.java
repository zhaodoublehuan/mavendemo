package com.zhh.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zhh.service.IRoleMenuService;

/**
* @ClassName: RoleMenuService
* @Description: 角色菜单对应关系
* @author zhh
* @date 2017-5-5 上午9:37:25
* 
*/
@Service
public class RoleMenuService implements IRoleMenuService {

	/* (非 Javadoc) 
	* <p>Title: selectMenuIdsByRoleIds</p> 
	* <p>Description: </p> 
	* @param roleIds
	* @return 
	* @see com.zhh.service.IRoleMenuService#selectMenuIdsByRoleIds(java.util.List) 
	*/ 
	
	public List<String> selectMenuIdsByRoleIds(List<String> roleIds) {
		
		return null;
	}

}
