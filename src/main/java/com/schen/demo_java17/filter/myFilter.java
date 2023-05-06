package com.schen.demo_java17.filter;

import com.schen.demo_java17.threadlocal.localholder;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import java.io.IOException;
@Slf4j
public class myFilter implements Filter {

    /**
     * 为Filter初始化 提供支持
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
    /**
     * 拦截到要执行的请求时，doFilter就会执行。这里我们可以写对请求和响应的预处理。
     * FilterChain把请求和响应传递给下一个 Filter处理
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //把普通servlet强转成httpServlet
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        Long threadId = Thread.currentThread().getId();
        log.info("过滤器的do filter,threadId:{} servletPath:{}", threadId, httpServletRequest.getServletPath());
        //把当前线程id放入requestHolder
        localholder.set("threadid:"+threadId);
        //放行
        filterChain.doFilter(httpServletRequest, servletResponse);
    }
    /**
     * Filter 实例销毁前的准备工作
     */
    @Override
    public void destroy() {

    }
}
