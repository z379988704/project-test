package com.xiupeilian.cat.controller;

import com.xiupeilian.cat.model.Brand;
import com.xiupeilian.cat.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/12/4 13:07
 * @Version: 1.0
 **/
@Controller
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;
    @ResponseBody
    @RequestMapping("/getBrand")
    public Brand getBrand(int id , HttpSession session){
        Brand brand = this.brandService.findBrandById(id);
        session.setAttribute("brand", brand);
       return brand;
    }

    @RequestMapping("/test")
    public String test(int id , HttpServletRequest request){
        Brand brand = this.brandService.findBrandById(id);
        request.setAttribute("brand", brand);
        return "1";
    }

}
