package org.study.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class TestConfiguration {

    @Bean
    public String hello(){
        return "Hello Test";
    }
}
