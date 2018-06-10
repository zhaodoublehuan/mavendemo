package com.zhh.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.zhh.dao.IRoleDao;
import com.zhh.entity.Role;
import com.zhh.service.IRoleService;
import com.zhh.service.IUserRoleService;
import com.zhh.util.CommonParams;
import com.zhh.util.UUIDUtils;

/**
* @ClassName: RoleService
* @Description: TODO(这里用一句话描述这个类的作用)
* @author zhh
* @date 2016-8-12 上午9:20:46
* 
*/
@SuppressWarnings("restriction")
@Service
public class RoleService implements IRoleService {
	
	private static final Logger LOGGER = Logger.getLogger(RoleService.class);
	/**
	* @Fields roleDao : dao注入
	*/
	@Resource
	private IRoleDao roleDao;
	@Autowired
	private IUserRoleService userRoleService;
	/* (非 Javadoc) 
	* <p>Title: add</p> 
	* <p>Description: </p> 
	* @param role
	* @return 
	* @see com.zhh.service.IRoleService#add(com.zhh.entity.Role) 
	*/ 
	public Role addRole(Role role) {
		LOGGER.info("添加角色信息===="+JSON.toJSONString(role));
		try{
			Date now = new Date();
			role.setId(UUIDUtils.getUUID());
			role.setInsertDate(now);
			role.setActive(CommonParams.ACTIVE);
			role.setUpdateDate(now);
			return roleDao.addRole(role);
		}catch (Exception e) {
			LOGGER.error("添加角色失败===="+e.getMessage());
			return null;
		}
		
	}

	/* (非 Javadoc) 
	* <p>Title: update</p> 
	* <p>Description: </p> 
	* @param role
	* @return 
	* @see com.zhh.service.IRoleService#update(com.zhh.entity.Role) 
	*/ 
	
	public Role updateRole(Role role) {
		LOGGER.info("修改角色信息===="+JSON.toJSONString(role));
		try{
			Date now = new Date();
			role.setUpdateDate(now);
			return roleDao.updateRole(role);
		}catch (Exception e) {
			LOGGER.error("修改角色失败===="+e.getMessage());
			return null;
		}
		
	}

	/* (非 Javadoc) 
	* <p>Title: delete</p> 
	* <p>Description: </p> 
	* @param role
	* @return 
	* @see com.zhh.service.IRoleService#delete(com.zhh.entity.Role) 
	*/ 
	
	public boolean deleteRole(String roleId) {
		LOGGER.info("删除角色信息===="+roleId);
		try{
			return roleDao.deleteRole(roleId);
		}catch (Exception e) {
			LOGGER.error("删除角色失败===="+e.getMessage());
			return false;
		}
	}
	/**
	 * 根据登录账号查询对应的角色信息
	 */
	public List<Role> selectRolesIdByLoginNo(String loginNo) {
		LOGGER.info("查询用户所拥有的的角色信息===="+loginNo);
		try{
			List<String> roleIds = userRoleService.selectRolesIdByLoginNo(loginNo);
			if(roleIds==null){
				return null;
			}else{
				return roleDao.getRolesByRoleIds(roleIds);
			}
		}catch (Exception e) {
			LOGGER.info("查询用户所拥有的的角色信息失败===="+loginNo);
			return null;
		}
		
	}

}
