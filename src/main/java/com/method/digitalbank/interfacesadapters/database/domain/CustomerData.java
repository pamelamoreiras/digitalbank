package com.method.digitalbank.interfacesadapters.database.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class CustomerData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String cpf;
    private AddressData address;
    private LocalDate birthdate;
    private Double income;
    @OneToMany(mappedBy = "customerData")
    private List<AccountData> accountData;
}
