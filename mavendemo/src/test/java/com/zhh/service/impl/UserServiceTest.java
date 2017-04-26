package com.zhh.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.zhh.base.BaseTest;
import com.zhh.entity.UserEntity;
import com.zhh.service.IUserService;
import com.zhh.util.UUIDUtils;

@SuppressWarnings("restriction")
public class UserServiceTest extends BaseTest {
	@Resource
	private IUserService userService;
	@Test
	public void testAdd() {
		UserEntity user = new UserEntity();
		user.setId(UUIDUtils.getUUID());
		user.setUserName("zhh");
		user = userService.add(user);
	}

	@Test
	public void testUpdate() {
		UserEntity user = new UserEntity();
		user.setId(UUIDUtils.getUUID());
		user.setUserName("zhh");
		user = userService.update(user);
		//System.out.println(JSON.toJSON(user));
	}

	@Test
	public void testDelete() {
		List<String> ids = new ArrayList<String>();
		ids.add("111111");
		userService.delete(ids);
	}

	@Test
	public void testSelectUsers() {
		UserEntity user = new UserEntity();
		user.setId(UUIDUtils.getUUID());
		user.setUserName("zhh");
		//userService.selectUsers(user);
		//System.out.println(JSON.toJSON(userList));
	}
	
	@Test
	public void testFindUserByUsername(){
		userService.findUserByUsername("zhh1");
	}
}
