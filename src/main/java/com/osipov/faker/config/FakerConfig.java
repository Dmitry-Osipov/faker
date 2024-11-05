package com.osipov.faker.config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.Locale;

@Lazy
@Configuration
public class FakerConfig {

    @Bean("ru")
    public Faker russianFaker() {
        return new Faker(Locale.of("ru"));
    }

    @Bean("en")
    public Faker usaFaker() {
        return new Faker(Locale.US);
    }

    @Bean("en-GB")
    public Faker britishFaker() {
        return new Faker(Locale.UK);
    }

    @Bean("fr")
    public Faker frenchFaker() {
        return new Faker(Locale.FRANCE);
    }

    @Bean("de")
    public Faker deutschFaker() {
        return new Faker(Locale.GERMANY);
    }

    @Bean("it")
    public Faker italianFaker() {
        return new Faker(Locale.ITALY);
    }

    @Bean("es")
    public Faker spanishFaker() {
        return new Faker(Locale.of("es"));
    }

    @Bean("pt")
    public Faker portugueseFaker() {
        return new Faker(Locale.of("pt"));
    }

    @Bean("pl")
    public Faker polishFaker() {
        return new Faker(Locale.of("pl"));
    }

    @Bean("sv")
    public Faker swedishFaker() {
        return new Faker(Locale.of("sv"));
    }

    @Bean("no")
    public Faker norwegianFaker() {
        return new Faker(Locale.of("no"));
    }

    @Bean("ar")
    public Faker arabicFaker() {
        return new Faker(Locale.of("ar"));
    }

    @Bean("tr")
    public Faker turkishFaker() {
        return new Faker(Locale.of("tr"));
    }

    @Bean("ja")
    public Faker japaneseFaker() {
        return new Faker(Locale.JAPANESE);
    }

    @Bean("ko")
    public Faker koreanFaker() {
        return new Faker(Locale.KOREA);
    }

    @Bean("zh")
    public Faker chineeseFaker() {
        return new Faker(Locale.CHINA);
    }

    @Bean("he")
    public Faker hebrewFaker() {
        return new Faker(Locale.of("he"));
    }
}
