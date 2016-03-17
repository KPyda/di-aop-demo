package com.example;

import org.springframework.stereotype.Component;

/**
 * Created by Jakub Pyda on 17.03.2016.
 */
@Component
public class AudienceImpl implements Audience {

    @Override
    public void takeSeats() {
        System.out.println("Proszę zająć miejsca");
    }

    @Override
    public void silencePhones() {
        System.out.println("Proszę wyciszyć telefony");
    }

    @Override
    public void applause() {
        System.out.println("Brawoo!");
    }

    @Override
    public void buuuu() {
        System.out.println("BUUUUUU!!!");
    }
}
