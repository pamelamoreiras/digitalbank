package com.method.digitalbank.interfacesadapters.database.mappers;

import com.method.digitalbank.entity.Account;
import com.method.digitalbank.interfacesadapters.database.domain.AccountData;
import com.method.digitalbank.usecases.dto.CreatedAccountModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ConverterOfAccount {

    public static CreatedAccountModel converterAccountToCreatedAccountModel(final Account account){
        return CreatedAccountModel.builder()
                .id(account.getId())
                .type(account.getType())
                .accountNumber(account.getAccountNumber())
                .branch(account.getBranch())
                .status(account.getStatus())
                .build();
    }

    public static AccountData converterAccountToAccountData(final Account account){
        return AccountData.builder()
                .id(account.getId().toString())
                .type(account.getType())
                .branch(account.getBranch())
                .accountNumber(account.getAccountNumber())
                .status(account.getStatus())
                .build();
    }

    public static Account converterAccountDataToAccount(final AccountData accountData){
        return Account.builder()
//                .id(accountData.getId())
                .type(accountData.getType())
                .branch(accountData.getBranch())
                .accountNumber(accountData.getAccountNumber())
                .status(accountData.getStatus())
                .build();
    }
}
