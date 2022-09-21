package com.method.digitalbank.usecases.dto;

import com.method.digitalbank.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateAccountModel {

    private UUID id;
    private String name;
    private String email;
    private String documentNumber;
    private Address address;
    private Integer birthdate;
    private Double income;
}
