package com.zhh.controller.productshop;

import com.zhh.controller.base.BaseController;
import com.zhh.entity.Menu;
import com.zhh.entity.ProductShop;
import com.zhh.service.IProductShopService;
import com.zhh.util.PageReturnParam;
import com.zhh.util.PageUtil;
import org.apache.log4j.Logger;
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
public class ProducctShopController extends BaseController {

    private static final Logger LOGGER = Logger.getLogger(ProducctShopController.class);

    @Autowired
    private IProductShopService productShopService;

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
        LOGGER.info("前台分页参数"+aoData);
        /*转换需要的参数*/
        PageUtil page = PageUtil.getPageParams(aoData);
        /*查询符合条件的用户*/
        List<ProductShop> productList = productShopService.selectShopListPage(null,page);
        /*查询总条数*/
        count = productShopService.selectShopCount(null);
        /*返回需要的分页参数*/
        PageReturnParam pageReturnParam = new PageReturnParam();
        pageReturnParam.setsEcho(page.getsEcho());
        pageReturnParam.setiTotalDisplayRecords(count);
        pageReturnParam.setiTotalRecords(count);
        pageReturnParam.setAaData(productList);
        return pageReturnParam;
    }
}
