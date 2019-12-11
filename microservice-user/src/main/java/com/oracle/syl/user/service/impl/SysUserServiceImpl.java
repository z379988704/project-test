package com.oracle.syl.user.service.impl;

import com.oracle.syl.user.mapper.SysUserMapper;
import com.oracle.syl.user.model.SysUser;
import com.oracle.syl.user.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/12/9 11:28
 * @Version: 1.0
 **/
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    public SysUser findUserById(int id) {
        return this.sysUserMapper.selectByPrimaryKey(id);
    }
}
