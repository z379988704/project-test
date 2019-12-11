package com.oracle.syl.common;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/12/10 16:52
 * @Version: 1.0
 **/
@Component
public class AuthenticationFilter extends ZuulFilter {
    @Autowired
    private RedisTemplate redisTemplate;
    /**
     定义过滤器的类型
     ERROR_TYPE = "error";
     POST_TYPE = "post";
     PRE_TYPE = "pre";
     ROUTE_TYPE = "route";

     pre：可以在请求被路由之前调用
     route：在路由请求时候被调用
     error：处理请求时发生错误时被调用
     post：在route和error过滤器之后被调用
     **/

    @Override
    public String filterType() {
        return null;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        //获取当前请求的上下文
        RequestContext context = RequestContext.getCurrentContext();
        //取到当前请求的request
        HttpServletRequest request = context.getRequest();
        String ip=request.getRemoteAddr();
        //调第三方服务能查到IP的归属地，做处理
        String token=request.getHeader("access-token");

        //判断目标资源是否是公开资源
        String uri=request.getRequestURI();
        if("login".indexOf(uri)>-1||"register".indexOf(uri)>-1){
            return null;
        }else{
            //非公开资源
            if(redisTemplate.hasKey("token:"+token)){
                //用户之前登陆过
                //权限认证
                /**
                 User user=redisTemplate.get("token:"+token);
                 user两个属性  role[]   permission []
                 List<Pemisson> list=user.getPemissonList();

                 **/
            }else{
                //身份认证不通过
                context.setSendZuulResponse(false);
                //终止转发，返回响应报文
                context.setResponseStatusCode(400);
                try {
                    context.getResponse().getWriter().write("{'status:400','info':'用户没登陆'}");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
