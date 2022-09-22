package com.method.digitalbank.usecase.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateAddresModel {
    private String street;
    private String city;
    private String country;
    private Integer number;
    private String district;
    private String complement;
}
