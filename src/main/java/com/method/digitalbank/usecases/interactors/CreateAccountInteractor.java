package com.method.digitalbank.usecases.interactors;

import com.method.digitalbank.entity.Account;
import com.method.digitalbank.entity.enums.AccountStatus;
import com.method.digitalbank.entity.enums.AccountType;
import com.method.digitalbank.interfacesadapters.database.mappers.ConverterOfAccount;
import com.method.digitalbank.usecases.dto.CreateAccountModel;
import com.method.digitalbank.usecases.dto.CreatedAccountModel;
import com.method.digitalbank.usecases.ports.CreateAccountInputPort;
import com.method.digitalbank.usecases.providers.AccountProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class CreateAccountInteractor implements CreateAccountInputPort {

    private final AccountProvider accountProvider;

    @Override
    public CreatedAccountModel execute(final CreateAccountModel model) {
        log.info("Start create account");

        var account = Account.builder().build();

        if (model.getBirthdate() > 16 && model.getIncome() > 500 ) {
            account = Account.builder()
                    .id(UUID.randomUUID())
                    .accountNumber(123)
                    .branch(4569)
                    .type(AccountType.CHECKING)
                    .status(AccountStatus.ACTIVE)
                    .build();
            accountProvider.createAccount(account);
        }

        return ConverterOfAccount.converterAccountToCreatedAccountModel(account);
    }
}
