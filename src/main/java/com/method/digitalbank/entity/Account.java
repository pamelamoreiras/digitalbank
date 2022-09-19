package com.method.digitalbank.entity;

import com.method.digitalbank.entity.enums.AccountStatus;
import com.method.digitalbank.entity.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {

    private UUID id;
    private AccountType type;
    private Integer branch;
    private Integer account;
    private AccountStatus status;
}
