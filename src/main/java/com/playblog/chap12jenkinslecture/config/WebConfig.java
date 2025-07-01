package com.playblog.chap12jenkinslecture.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("") // Ingress 설정으로 내부적으로 통신이 수행되므로 CORS 설정 없이도 통신 가능
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH");

    }
}
