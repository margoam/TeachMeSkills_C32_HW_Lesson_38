package com.tms;

import com.tms.config.AppConfig;
import com.tms.service.ServiceExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppRunner {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ServiceExample service = context.getBean(ServiceExample.class);

        service.slowMethod();
        service.annotatedMethod();
        service.fastMethod();

    }
}
