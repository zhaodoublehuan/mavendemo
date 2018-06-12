package com.zhh.controller.dict;

import com.zhh.controller.base.BaseController;
import com.zhh.entity.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 字典数据控制层
 */
@Controller
@RequestMapping("/dictData")
public class DictDataController extends BaseController {
    @RequestMapping("index")
    public String dictDataIndex(Model model){
        List<Menu> menuList = getUserMenus();
        model.addAttribute("menuList", menuList);
        return "ddata/ddataList";
    }
}
