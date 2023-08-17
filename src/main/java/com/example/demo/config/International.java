package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class International {


    @Bean
    public WebMvcConfigurer addCorsMappings(CorsRegistry registry) {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:5173") // Replace with the actual origin of your React app
                        .allowedMethods("GET","POST","PUT","DELETE")
                        .allowCredentials(true);
            }
        };
    }
}
