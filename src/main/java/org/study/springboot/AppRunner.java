package org.study.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.study.Saelobi;
import org.study.SaelobiProperties;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    private Saelobi saelobi;

//    @Value("${saelobi.name}")
//    private String name;
//
//    @Value("${saelobi.age}")
//    private int age;
//
//    @Value("${saelobi.fullName}")
//    private String fullName;

    @Autowired
    SaelobiProperties properties;

    @Autowired
    private String hello;

//    slf4j 로깅 파사드를 통해서 logback 로깅모듈을 지원
    private Logger logger = LoggerFactory.getLogger(AppRunner.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        System.out.println(Saelobi.class);
//        System.out.println(saelobi);
//        System.out.println(SaelobiProperties.class);
//        System.out.println(properties);
//
//        System.out.println("=============");
//        System.out.println(properties.getName());
//        System.out.println(properties.getAge());
//        System.out.println(properties.getFullName());
//        System.out.println(properties.getSessionTimeout());
//        System.out.println("=============");
//        System.out.println(hello);
//        System.out.println("=============");
        logger.info("==================");
        logger.info("This is Spring Boot App");
        logger.info("==================");
    }
}
