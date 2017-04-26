package com.zhh.realm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.alibaba.fastjson.JSON;
import com.zhh.entity.Permission;
import com.zhh.entity.Role;
import com.zhh.entity.UserEntity;
import com.zhh.service.IUserService;

/**
* @ClassName: UserRealm
* @Description: 自定义realm
* @author zhh
* @date 2016-8-12 下午2:53:41
* 
*/

@SuppressWarnings("restriction")
public class UserRealm extends AuthorizingRealm {
	/**
	* @Fields LOGGER : 记录日志
	*/
	private static final Logger LOGGER = Logger.getLogger(UserRealm.class);
	/**
	* @Fields userService : 注入用户service
	*/
	@Resource
	private IUserService userService;
	
	/* (非 Javadoc) 
	* <p>Title: 权限认证方法</p> 
	* <p>Description: </p> 
	* @param principals
	* @return 
	* @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection) 
	*/ 
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		LOGGER.info("权限验证开始========");
		/*获取到登录用户名*/
		String username = (String) principals.getPrimaryPrincipal();
		LOGGER.info("登录用户名========"+username);
	    /*获取用户的角色集合*/
	    Set<Role> roleSet =  userService.findUserByUsername(username).getRoleSet();
	    LOGGER.info("登录用户角色集合========"+JSON.toJSONString(roleSet));
	    //角色名的集合
	    Set<String> roles = new HashSet<String>();
	    //权限名的集合
	    Set<String> permissions = new HashSet<String>();
	    /*循环角色集合*/
	    Iterator<Role> it = roleSet.iterator();
	    while(it.hasNext()){
	      /*角色集合名称拼接字符串*/
	      roles.add(it.next().getName());
	      LOGGER.info("角色拥有的权限信息====="+it.next().getName()+"===="+JSON.toJSONString(it.next().getPermissionSet()));
	      /*循环权限信息*/
	      for(Permission per:it.next().getPermissionSet()){
	    	/*权限集合字符串拼接权限名称*/
	        permissions.add(per.getName());
	      }
	    }
	    /*新建权限认证信息*/
	    SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
	    /*角色设置*/
	    authorizationInfo.addRoles(roles);
	    /*权限信息设置*/
	    authorizationInfo.addStringPermissions(permissions);
	    LOGGER.info("未登录用户设置权限角色信息到shiro========结束");
	    return authorizationInfo;
	}

	/* (非 Javadoc) 
	* <p>Title: 登录认证方法</p> 
	* <p>Description: </p> 
	* @param token
	* @return
	* @throws AuthenticationException 
	* @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken) 
	*/ 
	
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		LOGGER.info("登录认证开始========");
		/*获取用户账户*/
		String username = (String) token.getPrincipal();
		LOGGER.info("登录用户的名称======="+username);
		/*根据账户查询用户*/
	    UserEntity user = userService.findUserByUsername(username);
	    LOGGER.info("数据库中是否存在该用户======="+JSON.toJSONString(user));
	    /*如果用户不存在*/
	    if(user==null){
	       LOGGER.warn("用户不存在");
	       throw new UnknownAccountException("没有找到该账号");
	    }
	    
	    /**
	     * 交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以在此判断或自定义实现  
	     */
	    SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user.getUserName(), user.getPassword(),getName());
	    LOGGER.info("由shiro验证用户信息的结果======="+JSON.toJSONString(info));
	    return info;
	  }
	  
	  @Override
	  public String getName() {
	    return getClass().getName();
	  }

}
