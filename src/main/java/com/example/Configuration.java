package com.example;

import org.springframework.context.annotation.Bean;

/**
 * Created by Jakub Pyda on 17.03.2016.
 */
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    Audience audience(){
        return new AudienceImpl();
    }

    @Bean(name = "performanceImpl")
    Performance performance(Audience audience) {
        return new PerformanceImpl(audience);
    }

}
