package com.tms.service;

import com.tms.annotation.LogExecutionTime;
import org.springframework.stereotype.Service;

@Service
public class ServiceExample {

    public void slowMethod() throws InterruptedException {
        Thread.sleep(1500);
        System.out.println("Slow Method");
    }

    public void fastMethod() {
        System.out.println("Fast Method");
    }

    @LogExecutionTime
    public void annotatedMethod() {
        System.out.println("Annotated Method");
    }
}
