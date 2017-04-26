package com.zhh.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.zhh.dao.IMenuDao;
import com.zhh.entity.Menu;
import com.zhh.service.IMenuService;
import com.zhh.util.UUIDUtils;

/**
* @ClassName: MenuService
* @Description: 菜单管理实现类
* @author zhh
* @date 2016-8-13 上午10:33:43
* 
*/
@SuppressWarnings("restriction")
@Service
public class MenuService implements IMenuService {
	
	/**
	* @Fields LOGGER : 记录日志
	*/
	private static final Logger LOGGER = Logger.getLogger(MenuService.class);
	
	/**
	* @Fields menuDao : dao注入
	*/
	@Resource
	private IMenuDao menuDao;
	
	/* (非 Javadoc) 
	* <p>Title: addMenu</p> 
	* <p>Description: </p> 
	* @param menu
	* @return 
	* @see com.zhh.service.IMenuService#addMenu(com.zhh.entity.Menu) 
	*/ 
	
	public Menu addMenu(Menu menu) {
		/*设置id*/
		menu.setId(UUIDUtils.getUUID());
		LOGGER.info("添加菜单======"+JSON.toJSONString(menu));
		return menuDao.addMenu(menu);
	}

	/* (非 Javadoc) 
	* <p>Title: updateMenu</p> 
	* <p>Description: </p> 
	* @param menu
	* @return 
	* @see com.zhh.service.IMenuService#updateMenu(com.zhh.entity.Menu) 
	*/ 
	
	public Menu updateMenu(Menu menu) {
		LOGGER.info("修改菜单======"+JSON.toJSONString(menu));
		return menuDao.updateMenu(menu);
	}

	/* (非 Javadoc) 
	* <p>Title: deleteMenu</p> 
	* <p>Description: </p> 
	* @param menuId
	* @return 
	* @see com.zhh.service.IMenuService#deleteMenu(java.lang.String) 
	*/ 
	
	public Menu deleteMenu(Menu menu) {
		LOGGER.info("删除菜单======"+JSON.toJSONString(menu));
		return menuDao.deleteMenu(menu);
	}

	/* (非 Javadoc) 
	* <p>Title: selectMenus</p> 
	* <p>Description: </p> 
	* @param menu
	* @return 
	* @see com.zhh.service.IMenuService#selectMenus(com.zhh.entity.Menu) 
	*/ 
	
	public List<Menu> selectMenus(Menu menu) {
		LOGGER.info("查询菜单条件======"+JSON.toJSONString(menu));
		List<Menu> menus = menuDao.selectMenus(menu);
		LOGGER.info("查询出的菜单为======"+JSON.toJSONString(menus));
		return menus;
	}

}
