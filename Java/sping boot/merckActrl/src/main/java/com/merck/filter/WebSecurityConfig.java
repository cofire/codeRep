package com.merck.filter;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 登录配置
 */
@SuppressWarnings("deprecation")
@Configuration
public class WebSecurityConfig extends WebMvcConfigurationSupport {
    public final static String SESSION_KEY = "username";

    /**
     * 配置静态访问资源
     * 
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }

    @Bean
    public SecurityInterceptor getSecurityInterceptor() {
        return new SecurityInterceptor();
    }

    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration addInterceptor = registry.addInterceptor(getSecurityInterceptor());
        System.out.println("添加过滤器");
        addInterceptor.excludePathPatterns("/error");
        addInterceptor.excludePathPatterns("/static/**");
        addInterceptor.excludePathPatterns("/css**");
        addInterceptor.excludePathPatterns("/js**");
        addInterceptor.excludePathPatterns("/visitor**");
        addInterceptor.excludePathPatterns("/login**");
        addInterceptor.addPathPatterns("/**");
    }

    private class SecurityInterceptor extends HandlerInterceptorAdapter {
        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
            HttpSession session = request.getSession();
            System.out.println("安全性验证");
            // 判断是否已有该用户登录的session
            if (session.getAttribute(SESSION_KEY) != null) {
                System.out.println("用户：" + session.getAttribute(SESSION_KEY));
                return true;
            }
            String path = request.getContextPath();
            System.out.println(path);
            // 跳转到登录页
            String url = "/login";
            response.sendRedirect(url);
            return false;
        }
    }
}
