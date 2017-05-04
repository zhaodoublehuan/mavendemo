package com.zhh.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhh.dao.IUserRoleDao;
import com.zhh.entity.UserRole;
@Repository	
public class UserRoleDao extends BaseDao implements IUserRoleDao {

	public UserRole addUserRole(UserRole userRole) {
		return null;
	}

	public boolean deleteUserRole(UserRole userRole) {
		return false;
	}

	public List<String> getRolesByUserId(String userId) {
		return null;
	}

}
