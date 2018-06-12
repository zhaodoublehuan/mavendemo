package com.zhh.controller.product;

import com.zhh.controller.base.BaseController;
import com.zhh.entity.Menu;
import com.zhh.entity.Product;
import com.zhh.service.ProductService;
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
 * 产品相关的信息处理
 */
@Controller
@RequestMapping("/product")
public class ProductController extends BaseController {

    private static final Logger LOGGER = Logger.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @RequestMapping("index")
    public String productIndex(Model model){
        List<Menu> menuList = getUserMenus();
        model.addAttribute("menuList", menuList);
        return "/product/productList";
    }
    /**
     * 添加产品
     * @return
     */
    public String addProducct(){

       return "";
    }

    /**
     * 修改产品信息
     * @return
     */
    public String editProduct(){
        return "";
    }

    /**
     * 删除产品信息
     * @return
     */
    public  String deleteProduct(){
        return "";
    }

    /**
     * 分页查询产品信息
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/productPage")
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
        List<Product> productList = productService.selectProductListPage(null,page);
        /*查询总条数*/
        count = productService.selectProductCount(null);

        return new PageReturnParam(page.getsEcho(),count,productList);
    }
}
