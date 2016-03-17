package com.example;

import org.springframework.stereotype.Component;

/**
 * Created by Jakub Pyda on 17.03.2016.
 */
@Component
public class PerformanceImpl implements Performance {

    @Override
    public void perform() throws Exception {
        System.out.println("Występ");
    }
}
