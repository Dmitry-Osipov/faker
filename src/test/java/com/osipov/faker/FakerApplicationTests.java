package com.osipov.faker;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class FakerApplicationTests {

    @Test
    void testFakeValuesServiceBothifyMethod() {
        var fakeValuesService = new FakeValuesService(
                Locale.of("en", "GB"), new RandomService()
        );
        String email = fakeValuesService.bothify("????##@gmail.com");  // Меняет ? на буквы, а # - на цифры
        Matcher emailMatcher = Pattern.compile("\\w{4}\\d{2}@gmail.com").matcher(email);
        assertTrue(emailMatcher.find());
    }

    @Test
    void testFakeValuesServiceRegexifyMethod() {
        var fakeValuesService = new FakeValuesService(
                Locale.of("en", "GB"), new RandomService()
        );
        String alphaNumberString = fakeValuesService.regexify("[a-z1-9]{10}");
        Matcher alphaNumberMatcher = Pattern.compile("[a-z1-9]{10}").matcher(alphaNumberString);
        assertTrue(alphaNumberMatcher.find());
    }

    @Test
    void testFakerClassWithStreet() {
        var faker = new Faker(Locale.of("en", "GB"));
        String streetName = faker.address().streetName();
        String buildingNumber = faker.address().buildingNumber();
        String city = faker.address().city();
        String country = faker.address().country();

        String data = String.format("%s %s %s %s%n", buildingNumber, streetName, city, country);
        assertTrue(data.split(" ").length >= 5);
    }

    @Test
    void testFakerClassGenerateRealLookingData() {
        var faker1 = new Faker(new Random(24));
        var faker2 = new Faker(new Random(24));

        assertEquals(faker1.name().name(), faker2.name().name());
    }

}
