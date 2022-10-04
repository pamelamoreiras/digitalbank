package com.method.digitalbank.interfacesadapters.database.entitydatabase;

import com.method.digitalbank.entitydomain.enums.AccountStatus;
import com.method.digitalbank.entitydomain.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class AccountData {

    @Id
    private String id;

    @Enumerated(EnumType.STRING)
    private AccountType type;
    private Integer branch;
    private Integer accountNumber;

    @Enumerated(EnumType.STRING)
    private AccountStatus status;

    @OneToOne(cascade = CascadeType.ALL)
    private CustomerData customerData;
}
