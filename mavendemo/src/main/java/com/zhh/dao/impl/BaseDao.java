package com.zhh.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
* @ClassName: BaseDao
* @Description: 公用的dao层，用来注入SQLSessionFactory
* @author zhh
* @date 2016-8-11 下午3:20:39
* 
*/

@SuppressWarnings("restriction")
public class BaseDao extends SqlSessionDaoSupport{
	 /* (非 Javadoc) 
	* <p>Title: setSqlSessionFactory</p> 
	* <p>Description: </p> 
	* @param sqlSessionFactory 
	* @see org.mybatis.spring.support.SqlSessionDaoSupport#setSqlSessionFactory(org.apache.ibatis.session.SqlSessionFactory) 
	*/ 
	
	@Resource  
     public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){  
         super.setSqlSessionFactory(sqlSessionFactory);  
     }  
}
