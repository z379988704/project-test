package com.xiupeilian.cat.service;

import com.xiupeilian.cat.model.Brand;

import java.util.List;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/11/28 11:46
 * @Version: 1.0
 **/
public interface BrandService {

    List<Brand> findBrandAll();

    Brand findBrandById(Integer brandId);

    int addBrand(Brand brand);
}
