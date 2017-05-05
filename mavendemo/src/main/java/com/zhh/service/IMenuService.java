package com.zhh.service;

import java.util.List;

import com.zhh.entity.Menu;

/**
* @ClassName: IMenuService
* @Description: 菜单管理Service
* @author zhh
* @date 2016-8-13 上午10:33:14
* 
*/

public interface IMenuService {
	
	/** 
	* @Title: addMenu 
	* @Description: 添加菜单信息
	* @param @param menu
	* @param @return    设定文件 
	* @return Menu    返回类型 
	* @throws 
	*/ 
	
	Menu addMenu(Menu menu);
	
	/** 
	* @Title: updateMenu 
	* @Description: 修改菜单信息 
	* @param @param menu
	* @param @return    设定文件 
	* @return Menu    返回类型 
	* @throws 
	*/ 
	
	Menu updateMenu(Menu menu);
	
	/** 
	* @Title: deleteMenu 
	* @Description: 删除菜单
	* @param @param menuId
	* @param @return    设定文件 
	* @return Menu    返回类型 
	* @throws 
	*/ 
	
	Menu deleteMenu(Menu menu);
	
	/** 
	* @Title: selectMenus 
	* @Description: 查询菜单
	* @param @param menu
	* @param @return    设定文件 
	* @return List<Menu>    返回类型 
	* @throws 
	*/ 
	
	List<Menu> selectMenus(Menu menu);
	
	/** 
	* @Title: selectMenusByLoginNo 
	* @Description: 通过loginNo查询该用户所能查看的菜单
	* @param @param loginNo
	* @param @return    设定文件 
	* @return List<Menu>    返回类型 
	* @throws 
	*/ 
	
	List<Menu> selectMenusByLoginNo(String loginNo);

}
