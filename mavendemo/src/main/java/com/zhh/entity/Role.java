package com.zhh.entity;
/*
CREATE TABLE `sys_role` (
`id` varchar(50) NOT NULL,
`name` varchar(32) NOT NULL COMMENT '名称',
`description` varchar(256) DEFAULT NULL COMMENT '描述',
`insert_date` datetime DEFAULT NULL,
`update_date` datetime DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
*/
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
* @ClassName: Role
* @Description: 角色实体类
* @author zhh
* @date 2016-8-12 上午9:15:54
* 
*/

public class Role implements Serializable {
	
	private static final long serialVersionUID = -4987248128309954399L;

	/**
	* @Fields id : 主键
	*/
	private String id;
	
	/**
	* @Fields name : 角色名称
	*/
	private String name;
	
	/**
	* @Fields description : 角色描述
	*/
	private String description;
	
	/**
	* @Fields insertDate : 插入时间
	*/
	private Date insertDate;
	
	/**
	* @Fields updateDate : 修改时间
	*/
	private Date updateDate;
	  
	/**
	* @Fields permissionSet : 角色拥有的权限集合
	*/
	private Set<Permission> permissionSet = new HashSet<Permission>();

	  public Role() {
	    super();
	  }

	  /** 
	* @Title: getId 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @return Integer    返回类型 
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
	    this.id = id;
	  }

	  /** 
	* @Title: getName 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws 
	*/ 
	
	public String getName() {
	    return name;
	  }

	  /** 
	* @Title: setName 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param name    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void setName(String name) {
	    this.name = name;
	  }

	  /** 
	* @Title: getPermissionSet 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @return Set<Permission>    返回类型 
	* @throws 
	*/ 
	
	public Set<Permission> getPermissionSet() {
	    return permissionSet;
	  }

	  /** 
	* @Title: setPermissionSet 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param permissionSet    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void setPermissionSet(Set<Permission> permissionSet) {
	    this.permissionSet = permissionSet;
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
		this.description = description;
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
	
	  /* (非 Javadoc) 
	* <p>Title: hashCode</p> 
	* <p>Description: </p> 
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	
	@Override
	  public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((id == null) ? 0 : id.hashCode());
	    return result;
	  }

	  /* (非 Javadoc) 
	* <p>Title: equals</p> 
	* <p>Description: </p> 
	* @param obj
	* @return 
	* @see java.lang.Object#equals(java.lang.Object) 
	*/ 
	
	@Override
	  public boolean equals(Object obj) {
	    if (this == obj)
	      return true;
	    if (obj == null)
	      return false;
	    if (getClass() != obj.getClass())
	      return false;
	    Role other = (Role) obj;
	    if (id == null) {
	      if (other.id != null)
	        return false;
	    } else if (!id.equals(other.id))
	      return false;
	    return true;
	  }
}
