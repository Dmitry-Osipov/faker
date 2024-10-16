package com.osipov.faker.config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.Locale;

@Lazy
@Configuration
public class FakerConfig {

    @Bean
    public Faker russianFaker() {
        return new Faker(Locale.of("ru"));
    }

    @Bean
    public Faker usaFaker() {
        return new Faker(Locale.US);
    }

    @Bean
    public Faker britishFaker() {
        return new Faker(Locale.of("en", "GB"));
    }

    @Bean
    public Faker frenchFaker() {
        return new Faker(Locale.FRANCE);
    }

    @Bean
    public Faker deutschFaker() {
        return new Faker(Locale.GERMANY);
    }

    @Bean
    public Faker italianFaker() {
        return new Faker(Locale.ITALY);
    }

    @Bean
    public Faker spanishFaker() {
        return new Faker(Locale.of("es"));
    }

    @Bean
    public Faker portugueseFaker() {
        return new Faker(Locale.of("pt"));
    }

    @Bean
    public Faker polishFaker() {
        return new Faker(Locale.of("pl"));
    }

    @Bean
    public Faker swedishFaker() {
        return new Faker(Locale.of("sv"));
    }

    @Bean
    public Faker norwegianFaker() {
        return new Faker(Locale.of("no"));
    }

    @Bean
    public Faker arabicFaker() {
        return new Faker(Locale.of("ar"));
    }

    @Bean
    public Faker turkishFaker() {
        return new Faker(Locale.of("tr"));
    }

    @Bean
    public Faker japaneseFaker() {
        return new Faker(Locale.JAPANESE);
    }

    @Bean
    public Faker koreanFaker() {
        return new Faker(Locale.KOREA);
    }

    @Bean
    public Faker chineeseFaker() {
        return new Faker(Locale.CHINA);
    }

    @Bean
    public Faker hebrewFaker() {
        return new Faker(Locale.of("he"));
    }
}
