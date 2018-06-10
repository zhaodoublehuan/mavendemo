package com.zhh.controller.chart;

import com.zhh.controller.base.BaseController;
import com.zhh.entity.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/chart")
public class ChartController extends BaseController {
    @RequestMapping("index")
    public String chartIndex(Model model){
        List<Menu> menuList = getUserMenus();
        model.addAttribute("menuList", menuList);
        return "/chart/chart";
    }
}
