package com.spring.springcorssserver;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override//addCorsMapping을 override해서 Mapping해줄것과,허용해줄 origin을 설정해준다.만약 모든 Mapping을 다 허용해주고 싶다면 /hello대신 ,/**로 적어주면 된다.
    public void addCorsMappings(CorsRegistry registry)
    {
        registry.addMapping("/hello")
                .allowedOrigins("http://localhost:18080");
    }
}
