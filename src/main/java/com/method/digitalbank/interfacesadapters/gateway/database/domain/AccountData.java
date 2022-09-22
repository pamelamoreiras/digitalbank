package com.method.digitalbank.interfacesadapters.gateway.database.domain;

import com.method.digitalbank.entity.enums.AccountStatus;
import com.method.digitalbank.entity.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Getter
@Setter
@AllArgsConstructor
@Builder
@Entity
@NoArgsConstructor
public class AccountData {

    @Id
    private String id;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    private Integer branch;
    private Integer account;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    @OneToOne
    private CustomerData customerData;
}
