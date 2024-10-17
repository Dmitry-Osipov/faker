package com.osipov.faker.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class FakeHuman {
    private String name;
    private String phoneNumber;
    private String gender;
    private String email;
    private String username;
    private String company;
    private String position;
    private LocalDate birthDate;

    private FakeHuman() {
    }
}
