package com.method.digitalbank.interfacesadapters.database.domain;

import com.method.digitalbank.entity.AccountStatus;
import com.method.digitalbank.entity.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class AccountData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private AccountType type;
    private Integer branch;
    private Integer account;
    private AccountStatus status;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerData customerData;
}
