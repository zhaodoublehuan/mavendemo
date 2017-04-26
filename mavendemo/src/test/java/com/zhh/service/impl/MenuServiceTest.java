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
		Date date = new Date();
		Menu menu = new Menu();
		menu.setMenuUrl("baidu.com");
		menu.setDescription("�˵�����");
		menu.setInsertDate(date);
		menu.setUpdateDate(date);
		menuService.addMenu(menu);
	}

	@Test
	public void testUpdateMenu() {
		Date date = new Date();
		Menu menu = new Menu();
		menu.setMenuUrl("baidu.com");
		menu.setDescription("�˵�����");
		menu.setInsertDate(date);
		menu.setUpdateDate(date);
		menuService.updateMenu(menu);
	}

	@Test
	public void testDeleteMenu() {
		Date date = new Date();
		Menu menu = new Menu();
		menu.setMenuUrl("baidu.com");
		menu.setDescription("�˵�����");
		menu.setInsertDate(date);
		menu.setUpdateDate(date);
		menuService.deleteMenu(menu);
	}

	@Test
	public void testSelectMenus() {
		Date date = new Date();
		Menu menu = new Menu();
		menu.setMenuUrl("baidu.com");
		menu.setDescription("�˵�����");
		menu.setInsertDate(date);
		menu.setUpdateDate(date);
		try {
			menuService.selectMenus(menu);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
