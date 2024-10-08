package com.osipov.faker.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FakeEntity {
    private String name;
    private String title;
    private Integer number;
}
