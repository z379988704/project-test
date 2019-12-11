package com.oracle.syl.user.controller;

import com.oracle.syl.user.model.SysUser;
import com.oracle.syl.user.remote.OrdersService;
import com.oracle.syl.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/12/9 12:39
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private OrdersService ordersService;
    @RequestMapping("/getUserById")
    public SysUser getUserById(int id){
        return sysUserService.findUserById(id);
    }
    @RequestMapping("/userInfo")
    public String userInfo(HttpServletRequest request,int id){
        long prot = request.getServerPort();
        SysUser sysUser = this.sysUserService.findUserById(id);
        return sysUser.toString()+prot;
    }
    @RequestMapping("/findSysUserAndOrders")
    public String findSysUserAndOrders(HttpServletRequest request,int id){
        long prot = request.getServerPort();
        SysUser sysUser = this.sysUserService.findUserById(id);
        String oeders = this.ordersService.findOrdersAndUser(sysUser.getId());
        return sysUser.toString()+prot+oeders;
    }
}
