package com.method.digitalbank.usecase.dto;


import com.method.digitalbank.entity.enums.AccountStatus;
import com.method.digitalbank.entity.enums.AccountType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreatedAccountModel {

    private String name;
    private String branch;
    private Integer accountNumber;
    private AccountType type;
    private AccountStatus status;
}
