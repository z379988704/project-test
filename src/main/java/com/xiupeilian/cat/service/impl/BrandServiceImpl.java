package com.xiupeilian.cat.service.impl;
import com.xiupeilian.cat.mapper.BrandMapper;
import com.xiupeilian.cat.model.Brand;
import com.xiupeilian.cat.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/11/28 11:46
 * @Version: 1.0
 **/
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> findBrandAll() {
        return this.brandMapper.findBrandAll();
    }

    @Override
    @Cacheable(value = "redisCache",key = "#root.methodName+#id")
    public Brand findBrandById(Integer brandId) {
        return this.brandMapper.selectByPrimaryKey(brandId);
    }
    @Transactional
    @Override
    public int addBrand(Brand brand) {
        return this.brandMapper.insertSelective(brand);
    }
}
