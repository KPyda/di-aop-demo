package com.example;

import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Jakub Pyda on 17.03.2016.
 */
@Aspect
@Component
public class AudienceAspect {

    Audience audience;

    @Autowired
    public AudienceAspect(Audience audience) {
        this.audience = audience;
    }

    @Pointcut("execution(* Performance.perform())")
    void perform(){}

    @Before("perform()")
    void before() {
        audience.takeSeats();
        audience.silencePhones();
    }

    @AfterReturning("perform()")
    void after(){
        audience.applause();
    }

    @AfterThrowing("perform()")
    void buuu() {
        audience.buuuu();
    }
}
