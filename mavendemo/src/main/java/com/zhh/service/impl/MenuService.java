package com.zhh.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.zhh.dao.IMenuDao;
import com.zhh.entity.Menu;
import com.zhh.service.IMenuService;
import com.zhh.service.IRoleMenuService;
import com.zhh.service.IUserRoleService;
import com.zhh.util.PageUtil;
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
	
	@Resource
	private IMenuDao menuDao;
	
	@Autowired
	private IUserRoleService userRoleService;
	@Autowired
	private IRoleMenuService roleMenuService;
	
	/* (非 Javadoc) 
	* <p>Title: addMenu</p> 
	* <p>Description: </p> 
	* @param menu
	* @return 
	* @see com.zhh.service.IMenuService#addMenu(com.zhh.entity.Menu) 
	*/ 
	
	public Menu addMenu(Menu menu) {
		LOGGER.info("添加菜单信息===="+JSON.toJSONString(menu));
		try{
			Date today = new Date();
			/*设置id*/
			menu.setId(UUIDUtils.getUUID());
			menu.setInsertDate(today);
			menu.setUpdateDate(today);
			return menuDao.addMenu(menu);			
		}catch (Exception e) {
			LOGGER.error("添加菜单信息失败==="+e.getMessage());
			return null;
		}
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
		try{
			Date today = new Date();
			menu.setUpdateDate(today);
			return menuDao.updateMenu(menu);			
		}catch (Exception e) {
			LOGGER.error("修改菜单失败====="+e.getMessage());
			return null;
		}
	}

	/* (非 Javadoc) 
	* <p>Title: deleteMenu</p> 
	* <p>Description: </p> 
	* @param menuId
	* @return 
	* @see com.zhh.service.IMenuService#deleteMenu(java.lang.String) 
	*/ 
	
	public boolean deleteMenu(String menuId) {
		LOGGER.info("删除菜单======"+menuId);
		try{
			return menuDao.deleteMenu(menuId);			
		}catch (Exception e) {
			LOGGER.error("删除菜单失败===="+e.getMessage());
			return false;
		}
	}

	/* (非 Javadoc) 
	* <p>Title: selectMenus</p> 
	* <p>Description: </p> 
	* @param menu
	* @return 
	* @see com.zhh.service.IMenuService#selectMenus(com.zhh.entity.Menu) 
	*/ 
	
	public List<Menu> selectMenus(Menu menu, PageUtil page) {
		try{
			LOGGER.info("查询菜单条件======"+JSON.toJSONString(menu));
			List<Menu> menus = menuDao.selectMenus(menu,page);
			LOGGER.info("查询出的菜单为======"+JSON.toJSONString(menus));
			return menus;			
		}catch (Exception e) {
						LOGGER.error("查询失败====="+e.getMessage());
						return null;
					}
				}
			
				/* (非 Javadoc) 
	* <p>Title: selectMenusByLoginNo</p> 
	* <p>Description: </p> 
	* @param loginNo
	* @return 
	* @see com.zhh.service.IMenuService#selectMenusByLoginNo(java.lang.String) 
	*/ 
	
	public List<Menu> selectMenusByLoginNo(String loginNo) {
		/*根据登录账号查询用户所拥有的角色*/
		List<String> roleIds = userRoleService.selectRolesByLoginNo(loginNo);
		/*根据角色集合查询所有的菜单id*/
		List<String> menuIds = roleMenuService.selectMenuIdsByRoleIds(roleIds);
		/*根据菜单id集合查询对应的菜单*/
		return menuDao.selectMenusByIds(menuIds);
	}

}
