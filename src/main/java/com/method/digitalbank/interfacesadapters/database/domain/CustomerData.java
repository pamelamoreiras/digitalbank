package com.method.digitalbank.interfacesadapters.database.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class CustomerData {

    @Id
    private String id;
    private String name;
    private String email;
    private String documentNumber;

    @OneToOne
    private AddressData addressData;
    private Integer birthdate;
    private Double income;

    @OneToOne
    private AccountData accountData;
}
