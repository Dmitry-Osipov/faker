package com.osipov.faker.service;

import com.github.javafaker.Faker;
import com.osipov.faker.dto.FakeHuman;
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
    public FakeHuman createFakeHuman() {
        var name = faker.name();

        return FakeHuman.builder()
                .name(name.name())
                .position(name.title())
                .phoneNumber(faker.phoneNumber().phoneNumber())
                .build();
    }
}
