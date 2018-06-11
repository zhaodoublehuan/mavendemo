package com.zhh.controller.base;

import com.zhh.entity.Menu;
import com.zhh.service.MenuService;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;

import javax.annotation.Resource;
import java.util.List;

/**
* @ClassName: HomeController
* @Description: 登录--首页控制层
* @author zhh
* @date 2016年8月12日 下午7:41:06
* 
*/

@SuppressWarnings("restriction")
public class BaseController {
	
	private static final Logger LOGGER = Logger.getLogger(BaseController.class);
	
	@Resource
	private MenuService menuService;

	public List<Menu> getUserMenus(){
        String  login_no = (String)SecurityUtils.getSubject().getPrincipal();
        LOGGER.error(login_no+"当前登录人");
        List<Menu> menuList = menuService.selectMenusByLoginNo(login_no);
	    return menuList;
    }
}
