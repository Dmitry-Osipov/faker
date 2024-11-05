package com.osipov.faker.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class FinanceInfo {
    private String cardNumber;
    private Integer cvv;
    private LocalDate cardExpiryDate;
    private String cardHolderName;
    private String iban;
    private String bankName;
    private String bic;
    private String bankAccountNumber;
    private Integer expenses;
    private Integer incomes;
}
