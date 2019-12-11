package com.xiupeilian.cat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/12/4 15:08
 * @Version: 1.0
 **/
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "1";
    }


}
