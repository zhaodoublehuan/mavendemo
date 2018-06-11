package com.zhh.service;

import java.util.List;

import com.zhh.dao.IRoleMenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @ClassName: RoleMenuService
* @Description: 角色菜单对应关系
* @author zhh
* @date 2017-5-5 上午9:37:25
* 
*/
@Service
public class RoleMenuService {

	@Autowired
	private IRoleMenuDao roleMenuDao;
	/* (非 Javadoc) 
	* <p>Title: selectMenuIdsByRoleIds</p> 
	* <p>Description: </p> 
	* @param roleIds
	* @return 
	* @see com.zhh.service.IRoleMenuService#selectMenuIdsByRoleIds(java.util.List) 
	*/
	public List<String> selectMenuIdsByRoleIds(List<String> roleIds) {
		return roleMenuDao.selectMenuIdsByRoleIds(roleIds);
	}

}
