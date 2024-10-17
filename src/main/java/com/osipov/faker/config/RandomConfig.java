package com.osipov.faker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.Random;

@Lazy
@Configuration
public class RandomConfig {

    @Bean
    public Random random() {
        return new Random();
    }
}
