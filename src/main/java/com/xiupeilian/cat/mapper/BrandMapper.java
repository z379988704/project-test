package com.xiupeilian.cat.mapper;
import com.xiupeilian.cat.base.BaseMapper;
import com.xiupeilian.cat.model.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BrandMapper  extends BaseMapper<Brand> {

    List<Brand> findBrandAll();
}