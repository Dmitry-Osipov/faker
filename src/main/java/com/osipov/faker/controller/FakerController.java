package com.osipov.faker.controller;

import com.osipov.faker.dto.FakeHuman;
import com.osipov.faker.service.FakerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FakerController {
    private final FakerService fakerService;

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FakeHuman createFakeEntity() {
        return fakerService.createFakeHuman();
    }
}
