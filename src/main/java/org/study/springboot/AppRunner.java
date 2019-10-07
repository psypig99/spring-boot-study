package org.study.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.study.Saelobi;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    private Saelobi saelobi;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(Saelobi.class);
        System.out.println(saelobi);
    }
}
