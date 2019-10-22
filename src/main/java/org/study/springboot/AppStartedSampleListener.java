package org.study.springboot;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppStartedSampleListener implements ApplicationListener<ApplicationStartedEvent> {
    /*
    * ApplicationStartedEvent 처럼 스프링 컨테이너가 만들어진 이후에 생성되는 이벤트들은 스프링 빈 등록을 통해서
    * 이벤트를 처리할 수 있음.
    * */
    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("=====================");
        System.out.println("Application started");
        System.out.println("=====================");
    }
}
