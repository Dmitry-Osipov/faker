package com.osipov.faker.service;

import com.github.javafaker.Faker;
import com.osipov.faker.dto.FakeHuman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Random;

@Service
public class GenerateFakeHuman {  // TODO: выделить абстракцию
    private final Random random;

    @Autowired
    public GenerateFakeHuman(Random random) {
        this.random = random;
    }

    public FakeHuman create(Faker faker) {
        var name = faker.name();
        var number = faker.number();

        return FakeHuman.builder()
                .name(name.name())
                .phoneNumber(faker.phoneNumber().phoneNumber())
                .gender(random.nextBoolean() ? "Male" : "Female")
                .email(faker.internet().emailAddress())
                .username(name.username())
                .company(faker.company().name())
                .position(name.title())
                .birthDate(LocalDate.of(
                        number.numberBetween(1950, 2015),
                        number.numberBetween(1, 13),
                        number.numberBetween(1, 29)
                ))
                .build();
    }
}
