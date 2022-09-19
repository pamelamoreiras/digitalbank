package com.method.digitalbank.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {

    private UUID id;
    private String name;
    private String email;
    private String documentNumber;
    private Address address;
    private LocalDate birthdate;
    private Double income;
}
