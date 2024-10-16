package com.osipov.faker.service;

import com.github.javafaker.Faker;
import com.osipov.faker.dto.FakeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class BritishFakerService implements FakerService {
    private final Faker faker;

    @Autowired
    public BritishFakerService(@Lazy @Qualifier("britishFaker") Faker faker) {
        this.faker = faker;
    }

    @Override
    public FakeEntity createFake() {
        var name = faker.name();

        return FakeEntity.builder()
                .name(name.name())
                .position(name.title())
                .number(faker.number().numberBetween(10, 1_000_000))
                .build();
    }
}
