package com.example;

/**
 * Created by Jakub Pyda on 17.03.2016.
 */
public class PerformanceImpl implements Performance {

    Audience audience;

    public PerformanceImpl(Audience audience) {
        this.audience = audience;
    }

    @Override
    public void perform() {
        audience.takeSeats();
        audience.silencePhones();
        System.out.println("Występ");
        audience.applause();
    }
}
