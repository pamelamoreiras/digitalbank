package com.method.digitalbank.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {

    private String name;
    private String email;
    private String cpf;
    private Address address;
    private LocalDate birthdate;
    private Double income;
}
