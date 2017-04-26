package com.zhh.dao;

import java.util.List;

import com.zhh.entity.Menu;

/**
* @ClassName: IMenuDao
* @Description: 菜单管理dao层
* @author zhh
* @date 2016-8-13 上午10:34:15
* 
*/

public interface IMenuDao {
	
	Menu addMenu(Menu menu);
	
	Menu updateMenu(Menu menu);
	
	Menu deleteMenu(Menu menu);
	
	List<Menu> selectMenus(Menu menu);
}
