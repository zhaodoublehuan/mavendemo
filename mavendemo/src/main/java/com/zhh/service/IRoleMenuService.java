package com.zhh.service;

import java.util.List;

/**
* @ClassName: IRoleMenuService
* @Description: 角色与菜单对应关系
* @author zhh
* @date 2017-5-5 上午9:32:32
* 
*/

public interface IRoleMenuService {

	/** 
	* @Title: selectMenuIdsByRoleIds 
	* @Description: 通过角色id查询对应的菜单集合
	* @param @param roleIds
	* @param @return    设定文件 
	* @return List<String>    返回类型 
	* @throws 
	*/ 
	
	public List<String> selectMenuIdsByRoleIds(List<String> roleIds);
}
