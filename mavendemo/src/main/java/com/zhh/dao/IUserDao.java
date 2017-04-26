package com.zhh.dao;

import java.util.List;

import com.zhh.entity.UserEntity;
import com.zhh.util.PageUtil;

/**
* @ClassName: IUserDao
* @Description: TODO(这里用一句话描述这个类的作用)
* @author zhh
* @date 2016-8-11 上午9:04:45
* 
*/

public interface IUserDao {

	/** 
	* @Title: add 
	* @Description: 新增用户
	* @param @param user
	* @param @return    设定文件 
	* @return UserEntity    返回类型 
	* @throws 
	*/ 
	
	UserEntity add(UserEntity user);
	
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
	* @Description: 通过账号查询用户 
	* @param @param username
	* @param @return    设定文件 
	* @return UserEntity    返回类型 
	* @throws 
	*/ 
	
	UserEntity findUserByUsername(String userName);

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
