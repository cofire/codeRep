package com.cofire.filter;

import java.io.IOException;

import javax.servlet.MultipartConfigElement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
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

    private static final Logger logger = LoggerFactory.getLogger(WebSecurityConfig.class);

    public final static String SESSION_KEY = "user";

    /**
     * 配置静态访问资源
     * 
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/pic/**").addResourceLocations("classpath:/pic/");
        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
        registry.addResourceHandler("/bootstrap/**").addResourceLocations("classpath:/static/bootstrap/");
        registry.addResourceHandler("/jquery/**").addResourceLocations("classpath:/static/jquery/");
        registry.addResourceHandler("/img/**").addResourceLocations("classpath:/static/img/");
        super.addResourceHandlers(registry);
    }

    @Bean
    public SecurityInterceptor getSecurityInterceptor() {
        return new SecurityInterceptor();
    }

    /**
     * 配置过滤规则
     */
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration addInterceptor = registry.addInterceptor(getSecurityInterceptor());
        System.out.println("添加过滤器");
        addInterceptor.excludePathPatterns("/error/**");
        addInterceptor.excludePathPatterns("/visitor/**");
        addInterceptor.excludePathPatterns("/login");
        addInterceptor.excludePathPatterns("/js/**");
        addInterceptor.excludePathPatterns("/css/**");
        addInterceptor.excludePathPatterns("/bootstrap/**");
        addInterceptor.excludePathPatterns("/jquery/**");
        addInterceptor.excludePathPatterns("/img/**");
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
            String url = path + "/error/notLogin";
            response.sendRedirect(url);
            return false;
        }
    }

    /**
     * 文件上传配置
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        // 单个文件最大
        factory.setMaxFileSize("10240KB"); // KB,MB
        /// 设置总上传数据总大小
        factory.setMaxRequestSize("102400KB");
        return factory.createMultipartConfig();
    }

}
