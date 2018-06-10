package com.zhh.controller.productshop;

import com.zhh.controller.base.BaseController;
import com.zhh.entity.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 合作商控制层
 */
@Controller
@RequestMapping("/pshop")
public class ProducctShopController extends BaseController {

    @RequestMapping("index")
    public String pshopIndex(Model model){
        List<Menu> menuList = getUserMenus();
        model.addAttribute("menuList", menuList);
        return "/pshop/pshopList";
    }
}
