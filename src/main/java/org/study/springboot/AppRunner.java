package org.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.study.Saelobi;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    private Saelobi saelobi;

    @Value("${saelobi.name}")
    private String name;

    @Value("${saelobi.age}")
    private int age;

    @Value("${saelobi.fullName}")
    private String fullName;

    @Autowired
    private String hello;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(Saelobi.class);
        System.out.println(saelobi);

        System.out.println("=============");
        System.out.println(name);
        System.out.println(age);
        System.out.println(fullName);
        System.out.println("=============");
        System.out.println(hello);
        System.out.println("=============");
    }
}
