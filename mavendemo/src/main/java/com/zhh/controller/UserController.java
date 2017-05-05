package com.zhh.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.zhh.entity.Menu;
import com.zhh.entity.UserEntity;
import com.zhh.service.IMenuService;
import com.zhh.service.IUserService;
import com.zhh.util.PageUtil;

@SuppressWarnings("restriction")
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
	
	private static final Logger LOGGER = Logger.getLogger(UserController.class);
	/**
	* @Fields userService : 用户信息service
	*/
	@Resource
	private IUserService userService;
	
	/**
	* @Fields menuService : 菜单信息service
	*/
	@Resource
	private IMenuService menuService;
	
	/** 
	* @Title: userIndex 
	* @Description:用户信息初始页面，显示所有用户
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws 
	*/ 
	@RequestMapping("/userList")
	public String userIndex(Model model){
		List<Menu> menuList = menuService.selectMenus(null,null);
        model.addAttribute("menuList", menuList);
		return "user/userList";
	}
	/** 
	* @Title: addUser 
	* @Description: 新建用户
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws 
	*/ 
	
	@RequestMapping("/addUser")
	public String addUser(UserEntity user,HttpServletResponse response){
		writeJson(user, response);
		return "user/userList";
	}
	/** 
	* @Title: updateUser 
	* @Description: 更新用户信息 
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws 
	*/ 
	
	@RequestMapping("/updateUser")
	public String updateUser(UserEntity user,HttpServletResponse response){
		userService.update(user);
		return "user/userList";
	}
	
	/** 
	* @Title: deleteUser 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @return    设定文件 
	* @return String    返回类型 
	* @throws 
	*/ 
	
	public String deleteUser(List<String> ids,HttpServletResponse response){
		userService.delete(ids);
		return "user/userList";
	}
	
	/** 
	* @Title: userPage 
	* @Description: 分页查询用户列表
	* @param @param response    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	@RequestMapping("/userPage")
	public void userPage(HttpServletRequest request,HttpServletResponse response){
		/*查询出来的数量*/ 
		int count = 10;
		/*接收前台datatabel传来分页用的参数*/
		String aoData=request.getParameter("aoData"); 
		LOGGER.info("前台分页参数"+aoData);
		/*转换需要的参数*/
		PageUtil page = PageUtil.getPageParams(aoData);
		/*查询符合条件的用户*/
		List<UserEntity> userList = userService.selectUsers(null,page);
		/*查询总条数*/
		count = userService.selectUsersCount(null);
		String json = "{\"sEcho\":" + page.getsEcho() + ",\"iTotalRecords\":" + count + ",\"iTotalDisplayRecords\":" + count + ",\"aaData\":" + JSON.toJSONString(userList) + "}";
		writeJson(json,response);
	}
}
