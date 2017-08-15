package com.zhh.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zhh.base.BaseTest;
import com.zhh.entity.UserEntity;
import com.zhh.exception.UserException;
import com.zhh.service.IUserService;
import com.zhh.util.UUIDUtils;

public class UserServiceTest extends BaseTest {
	@Autowired
	private IUserService userService;
	@Test
	public void testAdd() {
		UserEntity user = new UserEntity();
		user.setId(UUIDUtils.getUUID());
		user.setLoginNo("admin");
		user.setUserName("赵欢欢");
		user.setPassword("111111");
		try {
			user = userService.add(user);
		} catch (UserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testUpdate() {
		UserEntity user = new UserEntity();
		user.setId("e4a283af541f4b3e89a6fb5d0ba0d403");
		user.setUserName("zhh");
		user.setEmail("702324140@qq.com");
		user = userService.update(user);
	}

	@Test
	public void testDelete() {
		List<String> ids = new ArrayList<String>();
		ids.add("ebe461553fc0430cb332bcb7fee2d6d9");
		userService.delete(ids);
	}
	
	@Test
	public void testSelectUsers() {
		UserEntity user = new UserEntity();
		user.setId(UUIDUtils.getUUID());
		user.setUserName("zhh");

	}
	
	@Test
	public void testFindUserByUsername(){
		userService.findUserByLoginNo("zhh");
	}
}
