package com.osipov.faker.controller;

import com.osipov.faker.dto.FakeAddress;
import com.osipov.faker.dto.FakeHuman;
import com.osipov.faker.dto.FinanceInfo;
import com.osipov.faker.service.FakeGenerator;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/faker")
public class FakerController {
    private final FakeGenerator fakerService;

    public FakerController(@Lazy FakeGenerator fakerService) {
        this.fakerService = fakerService;
    }

    @GetMapping("/human")
    public FakeHuman createFakeHuman(@RequestParam(required = false) String language) {
        return fakerService.createHuman(language);
    }

    @GetMapping("/address")
    public FakeAddress createFakeAddress(@RequestParam(required = false) String language) {
        return fakerService.createAddress(language);
    }

    @GetMapping("/finance")
    public FinanceInfo createFinanceInfo(@RequestParam(required = false) String language) {
        return fakerService.createFinance(language);
    }
}
