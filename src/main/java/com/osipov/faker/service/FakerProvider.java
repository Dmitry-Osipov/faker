package com.osipov.faker.service;

import com.github.javafaker.Faker;

public interface FakerProvider {
    Faker getFaker(String language);
}
