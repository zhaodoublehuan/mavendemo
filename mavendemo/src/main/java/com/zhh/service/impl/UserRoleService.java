package com.zhh.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.zhh.dao.IUserRoleDao;
import com.zhh.entity.UserRole;
import com.zhh.service.IUserRoleService;

/**
* @ClassName: UserRoleService
* @Description: 用户角色信息service实现
* @author zhh
* @date 2017-5-4 上午10:39:26
* 
*/
@Service
public class UserRoleService implements IUserRoleService {
	
	private static final Logger LOGGER = Logger.getLogger(UserRoleService.class);
	
	@Autowired
	private IUserRoleDao userRoleDao;
	
	public UserRole addUserRole(UserRole userRole) {
		LOGGER.info("添加用户角色信息===="+JSON.toJSONString(userRole));
		try{
			return userRoleDao.addUserRole(userRole);
		}catch (Exception e) {
			LOGGER.error("添加用户角色信息失败====="+e.getMessage());
			return null;
		}
		
	}

	public boolean deleteUserRole(UserRole userRole) {
		LOGGER.info("删除用户角色信息===="+JSON.toJSONString(userRole));
		try{
			return userRoleDao.deleteUserRole(userRole);
		}catch (Exception e) {
			LOGGER.error("删除用户角色信息失败====="+e.getMessage());
			return false;
		}
	}


	/* (非 Javadoc) 
	* <p>Title: selectRolesByLoginNo</p> 
	* <p>Description: </p> 
	* @param loginNo
	* @return 
	* @see com.zhh.service.IUserRoleService#selectRolesByLoginNo(java.lang.String) 
	*/ 
	
	public List<String> selectRolesIdByLoginNo(String loginNo) {
		LOGGER.info("查询用户所拥有的角色信息===="+JSON.toJSONString(loginNo));
		try{
			return userRoleDao.selectRolesIdByLoginNo(loginNo);
		}catch (Exception e) {
			LOGGER.info("查询用户所拥有的角色信息失败===="+e.getMessage());
			return null;
		}
	}

}
