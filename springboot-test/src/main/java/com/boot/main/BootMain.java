package com.boot.main;


import com.boot.main.interceptor.SessionInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@SpringBootApplication //等同于 @Configuration @EnableAutoConfiguration @ComponentScanpublic
//@ServletComponentScan //使用@ServletComponentScan 注解后，Servlet、Filter、Listener 可以直接通过 @WebServlet、@WebFilter、@WebListener 注解自动注册，无需其他代码
public class BootMain {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BootMain.class, args);
    }


//    @Configuration
    static class   WebMvcConfigurer extends WebMvcConfigurerAdapter{
        //增加拦截器

        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/eat");
        }
    }

}
