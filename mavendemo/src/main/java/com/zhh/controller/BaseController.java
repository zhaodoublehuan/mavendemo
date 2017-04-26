package com.zhh.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;

/**
* @ClassName: BaseController
* @Description: 所有controller的父类，主要写公用方法
* @author zhh
* @date 2016-8-13 上午8:36:54
* 
*/

public class BaseController {
	private static final Logger LOGGER = Logger.getLogger(BaseController.class);
	/** 
	* @Title: writeJson 
	* @Description: 将json数据返回前台
	* @param @param obj
	* @param @param response    设定文件 
	* @return void    返回类型 
	* @throws 
	*/ 
	
	public void writeJson(Object obj,HttpServletResponse response){
		String result;
		/*将传来的对象转化为json字符串*/
		if(obj instanceof String){
			result =  (String) obj;
		}else{
			result = JSON.toJSONString(obj);
		}
		LOGGER.info("返回前台的json数据======="+result);
		/*设置response的传输格式为json*/
		response.setContentType("application/json");
		/*设置字符集*/
		response.setCharacterEncoding("UTF-8");
		try { 
         PrintWriter out = response.getWriter(); 
         /*给页面上传输json对象*/
         out.write(result);
	    } catch (IOException e) { 
	         e.printStackTrace(); 
	    } 
	}
}
