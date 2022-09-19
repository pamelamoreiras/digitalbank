package com.method.digitalbank.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address {

    private UUID id;
    private String street;
    private String district;
    private String city;
    private Integer number;
    private String complementAddress;
    private String zipCode;
}
