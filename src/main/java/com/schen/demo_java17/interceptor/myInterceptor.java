package com.schen.demo_java17.interceptor;

import com.schen.demo_java17.threadlocal.localholder;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;

@Slf4j
public class myInterceptor implements HandlerInterceptor {

    /*** 拦截处理程序的执行。在 HandlerMapping 确定合适的处理程序对象之后，在 HandlerAdapter 调用处理程序之前调用。
     ** @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception*/
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("拦截器preHandle执行。。。");
        log.info("当前线程的线程id存入localholder：{}",localholder.get());
        System.out.println(localholder.get());
        return true;
    }

    /*** 请求处理完成后（渲染视图后）的回调。将在处理程序执行的任何结果上调用，从而允许进行适当的资源清理。*
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception*/
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        localholder.remove();
        log.info("拦截器afterCompletion执行。。。清空threadlocal");
    }
}
