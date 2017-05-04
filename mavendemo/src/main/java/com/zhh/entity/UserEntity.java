package com.zhh.entity;
/*
CREATE TABLE `sys_user` (
`id` varchar(50) NOT NULL ,
`user_name` varchar(50) DEFAULT NULL COMMENT '姓名',
`password` varchar(32) DEFAULT NULL,
`mobile` varchar(16) DEFAULT NULL COMMENT '手机',
`email` varchar(50) DEFAULT NULL COMMENT '邮箱',
`active` varchar(10) DEFAULT NULL COMMENT '用户状态',
`insert_date` datetime DEFAULT NULL,
`update_date` datetime DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
*/
import java.util.Date;

/**
* @ClassName: UserEntity
* @Description: 用户信息实体类
* @author zhh
* @date 2016-8-12 上午9:16:13
* 
*/

public class UserEntity {
    /**
    * @Fields id : 主键id
    */
    private String id;
    /**
     * @Fields loginNo : 登录账号
     */
    private String loginNo;
    /**
    * @Fields userName : 用户账号
    */
    private String userName;
    /**
     * @Fields salt : 加密用的盐
     */
    private String salt;

    /**
    * @Fields password : 密码
    */
    private String password;

    /**
    * @Fields mobile : 手机号
    */
    private String mobile;

    /**
    * @Fields email : 邮箱
    */
    private String email;
    
    /**
    * @Fields active : 用户状态
    */
    private String active;

    /**
    * @Fields insertDate : 新建时间
    */
    private Date insertDate;

    /**
    * @Fields updateDate : 修改时间
    */
    private Date updateDate;
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
    * @Title: getUserName 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws 
    */ 
    
    public String getUserName() {
        return userName;
    }

    /** 
    * @Title: setUserName 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param userName    设定文件 
    * @return void    返回类型 
    * @throws 
    */ 
    
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /** 
    * @Title: getPassword 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws 
    */ 
    
    public String getPassword() {
        return password;
    }

    /** 
    * @Title: setPassword 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param password    设定文件 
    * @return void    返回类型 
    * @throws 
    */ 
    
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /** 
    * @Title: getMobile 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws 
    */ 
    
    public String getMobile() {
        return mobile;
    }

    /** 
    * @Title: setMobile 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param mobile    设定文件 
    * @return void    返回类型 
    * @throws 
    */ 
    
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /** 
    * @Title: getEmail 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws 
    */ 
    
    public String getEmail() {
        return email;
    }

    /** 
    * @Title: setEmail 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param email    设定文件 
    * @return void    返回类型 
    * @throws 
    */ 
    
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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
	* @Title: getActive 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws 
	*/ 
	
	public String getActive() {
		return active;
	}

	/** 
	* @Title: setActive 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param active    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void setActive(String active) {
		this.active = active;
	}

	public String getLoginNo() {
		return loginNo;
	}

	public void setLoginNo(String loginNo) {
		this.loginNo = loginNo;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
}