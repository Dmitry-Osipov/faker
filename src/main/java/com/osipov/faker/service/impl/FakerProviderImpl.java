package com.osipov.faker.service.impl;

import com.github.javafaker.Faker;
import com.osipov.faker.service.FakerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Objects;

@Lazy
@Component
public class FakerProviderImpl implements FakerProvider {
    private final Map<String, Faker> fakers;

    @Autowired
    public FakerProviderImpl(Map<String, Faker> fakers) {
        this.fakers = fakers;
    }

    public Faker getFaker(String language) {
        if (language == null || language.isBlank()) {
            return fakers.get("en");
        }

        return Objects.requireNonNull(fakers.get(language), "No Faker found for language: " + language);
    }
}
