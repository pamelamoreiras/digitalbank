package com.method.digitalbank.usecase.dto;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class CreateAccountModel {

    private String name;
    private String email;
    private String documentNumber;
    private CreateAddresModel address;
    private Integer age;
    private Double income;
}
