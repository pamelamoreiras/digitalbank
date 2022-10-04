package com.method.digitalbank.interfacesadapters.database.entitydatabase;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter @Setter
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
    private String phoneNumber;
    private String password;
}
