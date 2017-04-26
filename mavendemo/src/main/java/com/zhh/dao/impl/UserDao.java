package com.zhh.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zhh.dao.IUserDao;
import com.zhh.entity.UserEntity;
import com.zhh.util.PageUtil;

/**
* @ClassName: UserDao
* @Description: TODO(这里用一句话描述这个类的作用)
* @author zhh
* @date 2016-8-11 上午9:05:08
* 
*/
@Repository	
public class UserDao extends BaseDao implements IUserDao {
	
	private static final String NAME_SPACE="com.zhh.UserEntity";

	/* (非 Javadoc) 
	* <p>Title: add</p> 
	* <p>Description: </p> 
	* @param user
	* @return 
	* @see com.zhh.dao.IUserDao#add(com.zhh.entity.UserEntity) 
	*/ 
	
	public UserEntity add(UserEntity user) {
		int result = getSqlSession().insert(NAME_SPACE+".insertSelective", user);
		return result>0 ? user : null;
	}

	/* (非 Javadoc) 
	* <p>Title: update</p> 
	* <p>Description: </p> 
	* @param user
	* @return 
	* @see com.zhh.dao.IUserDao#update(com.zhh.entity.UserEntity) 
	*/ 
	
	public UserEntity update(UserEntity user) {
		int result = getSqlSession().update(NAME_SPACE+".updateByPrimaryKeySelective", user);
		return result>0 ? user : null;
	}

	/* (非 Javadoc) 
	* <p>Title: delete</p> 
	* <p>Description: </p> 
	* @param user
	* @return 
	* @see com.zhh.dao.IUserDao#delete(com.zhh.entity.UserEntity) 
	*/ 
	
	public boolean delete(List<String> ids) {
		int result = getSqlSession().update(NAME_SPACE+".deleteUsers", ids);
		return result>0 ? true : false;
	}

	/* (非 Javadoc) 
	* <p>Title: selectUsers</p> 
	* <p>Description: </p> 
	* @param user
	* @return 
	* @see com.zhh.dao.IUserDao#selectUsers(com.zhh.entity.UserEntity) 
	*/ 
	
	public List<UserEntity> selectUsers(UserEntity user, PageUtil page) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("user", user);
		params.put("page", page);
		return getSqlSession().selectList(NAME_SPACE+".selectUsers", params);
	}

	/* (非 Javadoc) 
	* <p>Title: findUserByUsername</p> 
	* <p>Description: </p> 
	* @param username
	* @return 
	* @see com.zhh.dao.IUserDao#findUserByUsername(java.lang.String) 
	*/ 
	
	public UserEntity findUserByLoginNo(String loginNo) {
		List<UserEntity> users = getSqlSession().selectList(NAME_SPACE+".findUserByUsername", loginNo);
		if(users != null && users.size()>0){
			return users.get(0);
		}
		return null;
	}

	/* (非 Javadoc) 
	* <p>Title: selectUsersCount</p> 
	* <p>Description: </p> 
	* @param user
	* @return 
	* @see com.zhh.dao.IUserDao#selectUsersCount(com.zhh.entity.UserEntity) 
	*/ 
	
	public int selectUsersCount(UserEntity user) {
		return getSqlSession().selectOne(NAME_SPACE+".selectUsersCount", user);
	}

}
