package com.zhh.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;

import com.zhh.base.BaseTest;
import com.zhh.entity.Role;
import com.zhh.service.IRoleService;
import com.zhh.util.UUIDUtils;
@SuppressWarnings("restriction")
public class RoleServiceTest extends BaseTest{
	
	@Resource
	private IRoleService roleService;
	@Test
	public void testAddRole() {
		Date date = new Date();
		Role role = new Role();
		role.setId(UUIDUtils.getUUID());
		role.setName("���Խ�ɫ");
		role.setDescription("���Խ�ɫ����");
		role.setInsertDate(date);
		role.setUpdateDate(date);
		roleService.addRole(role);
	}

	@Test
	public void testUpdateRole() {
		Date date = new Date();
		Role role = new Role();
		role.setId(UUIDUtils.getUUID());
		role.setName("���Խ�ɫ");
		role.setDescription("���Խ�ɫ����");
		role.setInsertDate(date);
		role.setUpdateDate(date);
		roleService.updateRole(role);
	}

	@Test
	public void testDeleteRole() {
		Date date = new Date();
		Role role = new Role();
		role.setId(UUIDUtils.getUUID());
		role.setName("���Խ�ɫ");
		role.setDescription("���Խ�ɫ����");
		role.setInsertDate(date);
		role.setUpdateDate(date);
		roleService.deleteRole(role);
	}

}
