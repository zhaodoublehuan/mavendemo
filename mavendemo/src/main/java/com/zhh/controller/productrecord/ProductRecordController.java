package com.zhh.controller.productrecord;


import com.zhh.controller.base.BaseController;
import com.zhh.entity.Menu;
import com.zhh.entity.ProductRecord;
import com.zhh.service.ProductRecordService;
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
 * 产品记录控制层
 */
@Controller
@RequestMapping("/precord")
@Log4j
public class ProductRecordController extends BaseController {

    @Autowired
    private ProductRecordService productRecordService;

    @RequestMapping("index")
    public String recordIndex(Model model){
        List<Menu> menuList = getUserMenus();
        model.addAttribute("menuList", menuList);
        return "/precord/precordList";
    }
    /**
     * 分页查询记录信息
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/recordPage")
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
        List<ProductRecord> recordList = productRecordService.selectRecordListPage(null,page);
        /*查询总条数*/
        count = productRecordService.selectRecordCount(null);
        return new PageReturnParam(page.getsEcho(),count,recordList);
    }
}
