package com.osipov.faker.service;

import com.osipov.faker.dto.FakeAddress;
import com.osipov.faker.dto.FakeHuman;
import com.osipov.faker.dto.FinanceInfo;

public interface FakeGenerator {
    FakeHuman createHuman(String language);
    FakeAddress createAddress(String language);
    FinanceInfo createFinance(String language);
}
