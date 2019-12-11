package com.xiupeilian.cat.base;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/11/26 11:59
 * @Version: 1.0
 **/
public interface BaseMapper<T> {
    int deleteByPrimaryKey(Integer id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
