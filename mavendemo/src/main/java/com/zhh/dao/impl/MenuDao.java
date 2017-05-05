package com.zhh.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhh.dao.IMenuDao;
import com.zhh.entity.Menu;
@Repository
public class MenuDao extends BaseDao implements IMenuDao {
	
	private static final String NAME_SPACE = "com.zhh.entity.Menu";

	/* (非 Javadoc) 
	* <p>Title: addMenu</p> 
	* <p>Description: </p> 
	* @param menu
	* @return 
	* @see com.zhh.dao.IMenuDao#addMenu(com.zhh.entity.Menu) 
	*/ 
	
	public Menu addMenu(Menu menu) {
		
		int result = this.getSqlSession().insert(NAME_SPACE+".insertSelective", menu);
		
		return result>0?menu:null;
	}

	/* (非 Javadoc) 
	* <p>Title: updateMenu</p> 
	* <p>Description: </p> 
	* @param menu
	* @return 
	* @see com.zhh.dao.IMenuDao#updateMenu(com.zhh.entity.Menu) 
	*/ 
	
	public Menu updateMenu(Menu menu) {

		int result = this.getSqlSession().update(NAME_SPACE+".updateByPrimaryKeySelective", menu);
		
		return result>0?menu:null;
	}

	/* (非 Javadoc) 
	* <p>Title: deleteMenu</p> 
	* <p>Description: </p> 
	* @param menuId
	* @return 
	* @see com.zhh.dao.IMenuDao#deleteMenu(java.lang.String) 
	*/ 
	
	public Menu deleteMenu(Menu menu) {
		
		int result = this.getSqlSession().update(NAME_SPACE+".updateByPrimaryKeySelective", menu);
		
		return result>0?menu:null;
	}

	/* (非 Javadoc) 
	* <p>Title: selectMenus</p> 
	* <p>Description: </p> 
	* @param menu
	* @return 
	* @see com.zhh.dao.IMenuDao#selectMenus(com.zhh.entity.Menu) 
	*/ 
	
	public List<Menu> selectMenus(Menu menu) {
		
		return this.getSqlSession().selectList(NAME_SPACE+".selectMenus", menu);
	}

	/* (非 Javadoc) 
	* <p>Title: selectMenusByIds</p> 
	* <p>Description: </p> 
	* @param ids
	* @return 
	* @see com.zhh.dao.IMenuDao#selectMenusByIds(java.util.List) 
	*/ 
	
	public List<Menu> selectMenusByIds(List<String> ids) {
		return null;
	}

}
