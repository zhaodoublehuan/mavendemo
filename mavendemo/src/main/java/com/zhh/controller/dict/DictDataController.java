package com.zhh.controller.dict;

import com.zhh.bean.DictDataBean;
import com.zhh.controller.base.BaseController;
import com.zhh.entity.Menu;
import com.zhh.service.DictDataService;
import com.zhh.util.PageReturnParam;
import com.zhh.util.PageUtil;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 字典数据控制层
 */
@Controller
@RequestMapping("/dictData")
@Log4j
public class DictDataController extends BaseController {

    @Autowired
    private DictDataService dictDataService;

    @RequestMapping("index")
    public String dictDataIndex(Model model){
        List<Menu> menuList = getUserMenus();
        model.addAttribute("menuList", menuList);
        return "ddata/ddataList";
    }

    @RequestMapping("ddataPage")
    @ResponseBody
    public PageReturnParam productPage(HttpServletRequest request, HttpServletResponse response){
        /*查询出来的数量*/
        int count = 10;
        /*接收前台datatabel传来分页用的参数*/
        String aoData=request.getParameter("aoData");
        log.info("前台分页参数"+aoData);
        /*转换需要的参数*/
        PageUtil page = PageUtil.getPageParams(aoData);
        /*查询符合条件的用户*/
        List<DictDataBean> productList = dictDataService.selectPageList(null,page);
        /*查询总条数*/
        count = dictDataService.selectPageCountByCondition(null);

        return new PageReturnParam(page.getsEcho(),count,productList);
    }
}
