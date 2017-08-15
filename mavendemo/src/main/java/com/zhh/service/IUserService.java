package com.zhh.service;

import java.util.List;

import com.zhh.entity.UserEntity;
import com.zhh.exception.UserException;
import com.zhh.util.PageUtil;

/**
* @ClassName: IUserService
* @Description: 用户信息的service接口
* @author zhh
* @date 2016-8-11 上午8:59:53
* 
*/
public interface IUserService {

	/**
	 * @throws UserException  
	* @Title: add 
	* @Description: 新增用户
	* @param @param user
	* @param @return    设定文件 
	* @return UserEntity    返回类型 
	* @throws 
	*/ 
	
	UserEntity add(UserEntity user) throws UserException;
	
	/** 
	* @Title: update 
	* @Description: 修改用户
	* @param @param user
	* @param @return    设定文件 
	* @return UserEntity    返回类型 
	* @throws 
	*/ 
	
	UserEntity update(UserEntity user);
	
	/** 
	* @Title: delete 
	* @Description: 删除用户 
	* @param @param user
	* @param @return    设定文件 
	* @return UserEntity    返回类型 
	* @throws 
	*/ 
	
	boolean delete(List<String> ids);
	
	/**
	 * @param page  
	* @Title: selectUsers 
	* @Description: 查询用户信息 
	* @param @param user
	* @param @return    设定文件 
	* @return List<UserEntity>    返回类型 
	* @throws 
	*/ 
	
	List<UserEntity> selectUsers(UserEntity user, PageUtil page);

	/** 
	* @Title: findUserByUsername 
	* @Description: 通过用户查询角色信息 
	* @param @param user
	* @param @return    设定文件 
	* @return List<UserEntity>    返回类型 
	* @throws 
	*/ 
	UserEntity findUserByLoginNo(String loginNo);

	/** 
	* @Title: selectUsersCount 
	* @Description: 查询用户数量
	* @param @param user
	* @param @return    设定文件 
	* @return int    返回类型 
	* @throws 
	*/ 
	
	int selectUsersCount(UserEntity user);
	
}
