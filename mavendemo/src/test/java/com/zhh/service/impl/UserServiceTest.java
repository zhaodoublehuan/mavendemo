package com.zhh.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhh.base.BaseTest;
import com.zhh.entity.UserEntity;
import com.zhh.service.IUserService;
import com.zhh.util.UUIDUtils;

public class UserServiceTest extends BaseTest {
	@Autowired
	private IUserService userService;
	@Test
	public void testAdd() {
		UserEntity user = new UserEntity();
		user.setId(UUIDUtils.getUUID());
		user.setUserName("zhh");
		user.setPassword("111111");
		user = userService.add(user);
	}

	@Test
	public void testUpdate() {
		UserEntity user = new UserEntity();
		user.setId("ebe461553fc0430cb332bcb7fee2d6d9");
		user.setUserName("zhh");
		user.setEmail("702324140@qq.com");
		user = userService.update(user);
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
