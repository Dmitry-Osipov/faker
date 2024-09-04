package com.osipov.faker.service;

import com.github.javafaker.Faker;
import com.osipov.faker.dto.FakeEntity;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class FakerServiceImpl implements FakerService {
    private static final Faker faker = new Faker(Locale.of("en", "GB"));

    @Override
    public FakeEntity createFake() {
        var name = faker.name();

        return FakeEntity.builder()
                .name(name.name())
                .title(name.title())
                .number(faker.number().numberBetween(10, 1_000_000))
                .build();
    }
}
