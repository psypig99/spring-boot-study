package org.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.study.Saelobi;

/*
@SpringBootApplication 클래스의 적정 위치는 디폴트 패키지에 위치하는 것이 좋음.
@ComponentScan 은 @SpringBootApplication 이 붙어있는 클래스를 기준으로 그 아래 위치까지 스프링 빈을 나타내는
어노테이션이 붙은 클래스를 찾기 때문임.
*/
/*
* @SpringBootApplication = @Configuration + @ComponentScan + @EnableAutoConfiguration 의 통합된 기능을 수행함.
* @ComponentScan : 스프링 빈을 나타내는 어노테이션이 붙은 클래스를 찾아서 스프링 빈으로 등록하는 기능
* @EnableAutoConfiguration : 스프링 프레임워크에서 많이 쓰이는 스프링 빈들을 자동적으로 컨테이너에 등록하는 기능을 수행.
* */
//@SpringBootApplication
//public class Application {
//
//    public static void main(String[] args){
//        SpringApplication.run(Application.class, args);
//    }
//}

/*
* 스프링 부트를 웹 어플리케이션이 아닌 일반 어플리케이션으로 활용하고자 하는 경우에는 아래와 같이 설정을 해야 함.
* @EnableAutoConfiguration 에는 스프링 부트 프로젝트를 기본적으로 웹 프로젝트로 만드는 기본값이 설정되어 있음.
* WebApplicationType.NONE 설정이 필요함.
* */
//@Configuration
//@ComponentScan
@SpringBootApplication
public class Application{
    public static void main(String[] args){
        SpringApplication application = new SpringApplication(Application.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    @Bean
    public Saelobi saelobi(){
        Saelobi saelobi = new Saelobi();
        saelobi.setName("KBS2");
        saelobi.setHowLong(50);
        return saelobi;
    }
}
