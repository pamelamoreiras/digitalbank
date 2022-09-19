package com.method.digitalbank.interfacesadapters.database.domain;

import com.method.digitalbank.entity.enums.AccountStatus;
import com.method.digitalbank.entity.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class AccountData {

    @Id
    private String id;
    private AccountType type;
    private Integer branch;
    private Integer account;
    private AccountStatus status;
    @OneToOne
    @JoinColumn(name = "customer_id")
    private CustomerData customerData;
}
