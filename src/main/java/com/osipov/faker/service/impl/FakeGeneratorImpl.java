package com.osipov.faker.service.impl;

import com.osipov.faker.dto.FakeAddress;
import com.osipov.faker.dto.FakeHuman;
import com.osipov.faker.dto.FinanceInfo;
import com.osipov.faker.service.FakeGenerator;
import com.osipov.faker.service.FakerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.concurrent.TimeUnit;

@Lazy
@Service
public class FakeGeneratorImpl implements FakeGenerator {
    private final FakerProvider fakerProvider;

    @Autowired
    public FakeGeneratorImpl(@Lazy FakerProvider fakerProvider) {
        this.fakerProvider = fakerProvider;
    }

    @Override
    public FakeHuman createHuman(String language) {
        var faker = fakerProvider.getFaker(language);
        var name = faker.name();
        var number = faker.number();

        return FakeHuman.builder()
                .name(name.name())
                .phoneNumber(faker.phoneNumber().phoneNumber())
                .gender(faker.bool().bool() ? "Male" : "Female")
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

    @Override
    public FakeAddress createAddress(String language) {
        var faker = fakerProvider.getFaker(language);
        var address = faker.address();
        var number = faker.number();

        return FakeAddress.builder()
                .country(address.country())
                .region(address.state())
                .city(address.city())
                .street(address.streetName())
                .houseNumber(String.valueOf(number.numberBetween(1, 500)))
                .apartmentNumber(String.valueOf(number.numberBetween(1, 1000)))
                .zip(address.zipCode())
                .build();
    }

    @Override
    public FinanceInfo createFinance(String language) {
        var faker = fakerProvider.getFaker(language);
        var finance = faker.finance();
        var number = faker.number();

        return FinanceInfo.builder()
                .cardNumber(finance.creditCard())
                .cvv(number.numberBetween(100, 1000))
                .cardExpiryDate(LocalDate.ofInstant(faker.date().future(365 * 5, TimeUnit.DAYS).toInstant(),
                        ZoneId.systemDefault()))
                .cardHolderName(faker.name().fullName())
                .iban(finance.iban())
                .bankName(faker.company().name())
                .bic(finance.bic())
                .bankAccountNumber(finance.creditCard())
                .expenses(number.numberBetween(1, 1_000_000_000))
                .incomes(number.numberBetween(1, 1_000_000_000))
                .build();
    }
}
