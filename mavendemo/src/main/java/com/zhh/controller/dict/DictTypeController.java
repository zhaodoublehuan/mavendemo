package com.zhh.controller.dict;


import com.zhh.controller.base.BaseController;
import com.zhh.entity.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 字典类型控制层
 */
@Controller
@RequestMapping("/dictType")
public class DictTypeController extends BaseController {
    @RequestMapping("index")
    public String dictTypeIndex(Model model){
        List<Menu> menuList = getUserMenus();
        model.addAttribute("menuList", menuList);
        return "dtype/dtypeList";
    }
}
