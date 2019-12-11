package com.oracle.syl.user.service;

import com.oracle.syl.user.model.SysUser;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/12/9 11:28
 * @Version: 1.0
 **/
public interface SysUserService {

    SysUser findUserById(int id);
}
