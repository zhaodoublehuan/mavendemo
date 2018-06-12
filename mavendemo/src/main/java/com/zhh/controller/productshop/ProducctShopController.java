package com.zhh.controller.productshop;

import com.zhh.controller.base.BaseController;
import com.zhh.entity.Menu;
import com.zhh.entity.ProductShop;
import com.zhh.service.ProductShopService;
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
 * 合作商控制层
 */
@Controller
@RequestMapping("/pshop")
@Log4j
public class ProducctShopController extends BaseController {

    @Autowired
    private ProductShopService productShopService;

    @RequestMapping("index")
    public String pshopIndex(Model model){
        List<Menu> menuList = getUserMenus();
        model.addAttribute("menuList", menuList);
        return "/pshop/pshopList";
    }
    /**
     * 分页查询产品信息
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/shopPage")
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
        List<ProductShop> productList = productShopService.selectShopListPage(null,page);
        /*查询总条数*/
        count = productShopService.selectShopCount(null);

        return new PageReturnParam(page.getsEcho(),count,productList);
    }
}
