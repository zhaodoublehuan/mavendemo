package com.zhh.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSON;
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
			menuService.selectMenus(menu,null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	@Test
	public void testSelectMenusByLoginNo(){
		String login_no = "zhh";
		System.out.print(JSON.toJSONString(menuService.selectMenusByLoginNo(login_no)));
	}

	@Test
	public void selectMenusByIds() {
		List<String> menuIds = new ArrayList<String>();
		menuIds.add("0eab13f9cecc4ad591ffc9576a0ddc0f");
		System.out.print(JSON.toJSONString(menuService.selectMenusByIds(menuIds)));
	}
}
