package com.zhh.controller.dict;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 字典数据控制层
 */
@Controller
@RequestMapping("/dictData")
public class DictDataController {
    @RequestMapping("index")
    public String dictDataIndex(){
        return "";
    }
}
