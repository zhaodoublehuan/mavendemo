package com.zhh.service.impl;

import com.alibaba.fastjson.JSON;
import com.zhh.base.BaseTest;
import com.zhh.service.IRoleMenuService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RoleMenuServiceTest extends BaseTest {

    @Autowired
    private IRoleMenuService roleMenuService;
    @Test
    public void selectMenuIdsByRoleIds() {
        List<String> roleIds = new ArrayList<String>();
        roleIds.add("20206c39f81a4f39a3e76270366364dd");
        List<String> menuIds = roleMenuService.selectMenuIdsByRoleIds(roleIds);
        System.out.print(JSON.toJSONString(menuIds));
    }
}