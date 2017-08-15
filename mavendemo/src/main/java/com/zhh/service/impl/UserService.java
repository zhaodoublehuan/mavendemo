package com.zhh.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.zhh.dao.IUserDao;
import com.zhh.entity.UserEntity;
import com.zhh.exception.UserException;
import com.zhh.service.IUserService;
import com.zhh.util.CommonParams;
import com.zhh.util.PageUtil;
import com.zhh.util.UUIDUtils;

/**
* @ClassName: UserService
* @Description: 用户信息管理实现层
* @author zhh
* @date 2016-8-11 上午9:03:50
* 
*/
@SuppressWarnings("restriction")
@Service
public class UserService implements IUserService {
	
	private static final Logger LOGGER = Logger.getLogger(UserService.class);
	
	@Resource
	private IUserDao userDao;

	/* (非 Javadoc) 
	* <p>Title: add</p> 
	* <p>Description: </p> 
	* @param user
	* @return 
	* @see com.zhh.service.IUserService#add(com.zhh.entity.UserEntity) 
	*/ 
	
	public UserEntity add(UserEntity user) throws UserException {
		
		try{
			String password = user.getPassword();
			String salt = UUIDUtils.getUUID();
			password =  new Md5Hash(password,salt,2).toHex(); 
			Date now = new Date();
			/*设置ID*/
			user.setId(UUIDUtils.getUUID());
			user.setInsertDate(now);
			user.setUpdateDate(now);
			user.setSalt(salt);
			user.setActive(CommonParams.ACTIVE);
			user.setPassword(password);
			LOGGER.warn("添加用户信息为========"+JSON.toJSONString(user));
			return userDao.add(user);
		}catch (Exception e) {
			LOGGER.error("添加用户失败========"+e.getMessage());
			throw new UserException("添加用户失败！");
		}
		
		
		
	}

	/* (非 Javadoc) 
	* <p>Title: update</p> 
	* <p>Description: </p> 
	* @param user
	* @return 
	* @see com.zhh.service.IUserService#update(com.zhh.entity.UserEntity) 
	*/ 
	
	public UserEntity update(UserEntity user) {
		try{
			LOGGER.warn("修改用户信息为========"+JSON.toJSONString(user));
			return userDao.update(user);
		}catch (Exception e) {
			LOGGER.error("修改用户失败========"+e.getMessage());
			return null;
		}
		
	}

	/* (非 Javadoc) 
	* <p>Title: delete</p> 
	* <p>Description: </p> 
	* @param user
	* @return 
	* @see com.zhh.service.IUserService#delete(com.zhh.entity.UserEntity) 
	*/ 
	@Transactional
	public boolean delete(List<String> ids) {
		try{
			LOGGER.warn("删除用户信息为========"+JSON.toJSONString(ids));
			return userDao.delete(ids);
		}catch (Exception e) {
			LOGGER.error("删除用户失败========"+e.getMessage());
			return false;
		}
		
	}
	

	/* (非 Javadoc) 
	* <p>Title: selectUsers</p> 
	* <p>Description: </p> 
	* @param user
	* @return 
	* @see com.zhh.service.IUserService#selectUsers(com.zhh.entity.UserEntity) 
	*/ 
	
	public List<UserEntity> selectUsers(UserEntity user,PageUtil page) {
		return userDao.selectUsers(user,page);
	}

	/* (非 Javadoc) 
	* <p>Title: findUserByUsername</p> 
	* <p>Description: 通过账号查询用户</p> 
	* @param username
	* @return 
	* @see com.zhh.service.IUserService#findUserByUsername(java.lang.String) 
	*/ 
	
	public UserEntity findUserByLoginNo(String loginNo) {
		UserEntity user = userDao.findUserByLoginNo(loginNo);
		return user;
	}

	/* (非 Javadoc) 
	* <p>Title: selectUsersCount</p> 
	* <p>Description: </p> 
	* @param user
	* @return 
	* @see com.zhh.service.IUserService#selectUsersCount(com.zhh.entity.UserEntity) 
	*/ 
	
	public int selectUsersCount(UserEntity user) {
		// TODO Auto-generated method stub
		return userDao.selectUsersCount(user);
	}

	

}
