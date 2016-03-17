package com.example;

import org.springframework.stereotype.Component;

/**
 * Created by Jakub Pyda on 17.03.2016.
 */
@Component
public class PerformanceImpl implements Performance {

    @Override
    public void perform() {
        System.out.println("Występ");
    }
}
