package com.method.digitalbank.interfacesadapters.controllers.response;

import com.method.digitalbank.entitydomain.enums.AccountStatus;
import com.method.digitalbank.entitydomain.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateAccountResponse {

    private UUID id;
    private AccountType type;
    private Integer branch;
    private Integer accountNumber;
    private AccountStatus status;
}
