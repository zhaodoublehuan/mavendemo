package com.zhh.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
* @ClassName: Menu
* @Description: 菜单对应的实体类
* @author zhh
* @date 2016-8-13 上午10:23:15
* 
*/

public class Menu implements Serializable {

	private static final long serialVersionUID = -703248937151545172L;
	
	/**
	* @Fields id : 主键
	*/
	private String id;

    /**
    * @Fields menuUrl : 菜单地址
    */
    private String menuUrl;
    
    /**
    * @Fields menuName : 菜单名称
    */
    private String menuName;

    private String iconClass;

	/**
    * @Fields level : 菜单级别

    */
    private String level;
    
    /**
    * @Fields state : 菜单折叠状态 默认“close”
    */
    private String state;
    
    /**
    * @Fields sort : 菜单顺序
    */
    private String sort;
    
    /**
    * @Fields leaf : 是否子叶节点
    */
    private String leaf;

    /**
    * @Fields description : 菜单描述
    */
    private String description;
    
    /**
    * @Fields status : 菜单状态
    */
    private String active;

    /**
    * @Fields parentId : 父菜单id
    */
    private String parentId;

    /**
    * @Fields insertDate : 插入时间
    */
    private Date insertDate;

    /**
    * @Fields updateDate : 修改时间
    */
    private Date updateDate;
    
    /**
    * @Fields childrenMenu : 子级菜单
    */
    private List<Menu> childrenMenus;

    /** 
    * @Title: getId 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws 
    */ 
    
    public String getId() {
        return id;
    }

    /** 
    * @Title: setId 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param id    设定文件 
    * @return void    返回类型 
    * @throws 
    */ 
    
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /** 
    * @Title: getMenuUrl 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws 
    */ 
    
    public String getMenuUrl() {
        return menuUrl;
    }

    /** 
    * @Title: setMenuUrl 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param menuUrl    设定文件 
    * @return void    返回类型 
    * @throws 
    */ 
    
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    /** 
    * @Title: getDescription 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws 
    */ 
    
    public String getDescription() {
        return description;
    }

    /** 
    * @Title: setDescription 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param description    设定文件 
    * @return void    返回类型 
    * @throws 
    */ 
    
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /** 
    * @Title: getParentId 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @return    设定文件 
    * @return Integer    返回类型 
    * @throws 
    */ 
    
    public String getParentId() {
        return parentId;
    }

    /** 
    * @Title: setParentId 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param parentId    设定文件 
    * @return void    返回类型 
    * @throws 
    */ 
    
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /** 
    * @Title: getInsertDate 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @return    设定文件 
    * @return Date    返回类型 
    * @throws 
    */ 
    
    public Date getInsertDate() {
        return insertDate;
    }

    /** 
    * @Title: setInsertDate 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param insertDate    设定文件 
    * @return void    返回类型 
    * @throws 
    */ 
    
    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }

    /** 
    * @Title: getUpdateDate 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @return    设定文件 
    * @return Date    返回类型 
    * @throws 
    */ 
    
    public Date getUpdateDate() {
        return updateDate;
    }

    /** 
    * @Title: setUpdateDate 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param updateDate    设定文件 
    * @return void    返回类型 
    * @throws 
    */ 
    
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

	/** 
	* @Title: getMenuName 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws 
	*/ 
	
	public String getMenuName() {
		return menuName;
	}

	/** 
	* @Title: setMenuName 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param menuName    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	/** 
	* @Title: getLevel 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws 
	*/ 
	
	public String getLevel() {
		return level;
	}

	/** 
	* @Title: setLevel 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param level    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void setLevel(String level) {
		this.level = level;
	}

	/** 
	* @Title: getState 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws 
	*/ 
	
	public String getState() {
		return state;
	}

	/** 
	* @Title: setState 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param state    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void setState(String state) {
		this.state = state;
	}

	/** 
	* @Title: getSort 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws 
	*/ 
	
	public String getSort() {
		return sort;
	}

	/** 
	* @Title: setSort 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param sort    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void setSort(String sort) {
		this.sort = sort;
	}

	/** 
	* @Title: getLeaf 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws 
	*/ 
	
	public String getLeaf() {
		return leaf;
	}

	/** 
	* @Title: setLeaf 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param leaf    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void setLeaf(String leaf) {
		this.leaf = leaf;
	}

	/** 
	* @Title: getParentMenu 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @return Menu    返回类型 
	* @throws 
	*/ 
	
/*	public Menu getParentMenu() {
		return parentMenu;
	}*/

	/** 
	* @Title: setParentMenu 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param parentMenu    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
/*	public void setParentMenu(Menu parentMenu) {
		this.parentMenu = parentMenu;
	}*/

	/** 
	* @Title: getChildrenMenu 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @return List<Menu>    返回类型 
	* @throws 
	*/ 
	
	public List<Menu> getChildrenMenus() {
		return childrenMenus;
	}

	/** 
	* @Title: setChildrenMenu 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param childrenMenu    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void setChildrenMenus(List<Menu> childrenMenus) {
		this.childrenMenus = childrenMenus;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getIconClass() {
		return iconClass;
	}

	public void setIconClass(String iconClass) {
		this.iconClass = iconClass;
	}



}
