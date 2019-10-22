package org.study.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("production")
@Configuration
public class BaseConfiguration {

    @Bean
    public String hello(){
        return "hello production";
    }
}
