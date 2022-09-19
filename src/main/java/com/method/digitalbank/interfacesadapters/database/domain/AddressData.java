package com.method.digitalbank.interfacesadapters.database.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class AddressData {

    @Id
    private String id;
    private String street;
    private String district;
    private String city;
    private Integer number;
    private String complementAddress;
    private String zipCode;
}
