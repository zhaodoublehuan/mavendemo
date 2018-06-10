package com.zhh.controller.productrecord;


import com.zhh.controller.base.BaseController;
import com.zhh.entity.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 产品记录控制层
 */
@Controller
@RequestMapping("/precord")
public class ProductRecordController extends BaseController {

    @RequestMapping("index")
    public String recordIndex(Model model){
        List<Menu> menuList = getUserMenus();
        model.addAttribute("menuList", menuList);
        return "/precord/precordList";
    }
}
