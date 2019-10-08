package org.study.springboot;/*
* Test code 를 실행할 때 src에 있는 클래스 파일과 리소스 파일이 classpath 안으로 들어간다.
* 그 다음 테스트 코드를 컴파일하며 test 밑의 모든 파일들이 classpath 안으로 들어간다.
* 이 때 test 안의 application.properties 가 테스트용도로 바뀐다.
* */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringApplicationTests {

    @Autowired
    Environment environment;

    @Test
    public void contextLoads(){
//        assertThat(environment.getProperty("saelobi.name"))
//                .isEqualTo("KIMBSYU");
    }
}