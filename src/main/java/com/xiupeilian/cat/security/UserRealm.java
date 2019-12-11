package com.xiupeilian.cat.security;


import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @Description: 登录认证授权
 * @Author: Tu Xu
 * @CreateDate: 2019/8/29 10:17
 * @Version: 1.0
 **/
public class UserRealm extends AuthorizingRealm {





    /**
     * @Description: 授权的方法 (subject第一次访问需要权限才可以访问url的时候)
     * @Author: Administrator
     * @Param: [principalCollection]
     * @Return org.apache.shiro.authz.AuthorizationInfo
     **/
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection collection) {
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
        return info;
    }

    /**
     * @Description: 登录认证的方法(subject.login ( token))
     * @Author: Administrator
     * @Param: [authenticationToken]
     * @Return org.apache.shiro.authc.AuthenticationInfo
     **/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        AuthenticationInfo info = new SimpleAuthenticationInfo("A", "123", getName());
        return info;
    }
}
