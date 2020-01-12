package top.lllyl2012.gmall.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import top.lllyl2012.gmall.annotations.LoginRequired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AuthInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //判断是否需要拦截
        HandlerMethod mh = (HandlerMethod)handler;
        LoginRequired methodAnnotation = mh.getMethodAnnotation(LoginRequired.class);
        if (methodAnnotation == null) {
            return true;
        }

        System.out.println("进入拦截器");

        return true;
    }
}
