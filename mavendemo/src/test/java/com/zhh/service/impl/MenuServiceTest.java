package com.zhh.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;

import com.zhh.base.BaseTest;
import com.zhh.entity.Menu;
import com.zhh.service.IMenuService;
@SuppressWarnings("restriction")
public class MenuServiceTest extends BaseTest {
	
	@Resource
	private IMenuService menuService;
	@Test
	public void testAddMenu() {
		Menu menu = new Menu();
		menu.setMenuUrl("baidu.com");
		menu.setDescription("添加菜单描述");
		menuService.addMenu(menu);
	}

	@Test
	public void testUpdateMenu() {
		Menu menu = new Menu();
		menu.setMenuUrl("baidu.com");
		menu.setDescription("修改菜单描述");
		menuService.updateMenu(menu);
	}

	@Test
	public void testDeleteMenu() {
		menuService.deleteMenu("");
	}

	@Test
	public void testSelectMenus() {
		Date date = new Date();
		Menu menu = new Menu();
		menu.setMenuUrl("baidu.com");
		menu.setDescription("根据条件查询");
		menu.setInsertDate(date);
		menu.setUpdateDate(date);
		try {
			menuService.selectMenus(menu);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
