package com.osipov.faker.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FakeAddress {
    private String country;
    private String region;
    private String city;
    private String street;
    private String houseNumber;
    private String apartmentNumber;
    private String zip;
}
