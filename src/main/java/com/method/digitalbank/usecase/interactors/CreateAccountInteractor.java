package com.method.digitalbank.usecase.interactors;

import com.method.digitalbank.entity.Account;
import com.method.digitalbank.entity.enums.AccountStatus;
import com.method.digitalbank.entity.enums.AccountType;
import com.method.digitalbank.usecase.dto.CreateAccountModel;
import com.method.digitalbank.usecase.dto.CreatedAccountModel;
import com.method.digitalbank.usecase.ports.CreateAccountInputPort;
import com.method.digitalbank.usecase.providers.AccountProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class CreateAccountInteractor implements CreateAccountInputPort {

    private final AccountProvider accountProvider;

    @Override
    public CreatedAccountModel execute(CreateAccountModel model) {

        if (!atendeAosrequisitosParaAbrirContaNoBancoPamela(model)) {
           throw new RuntimeException();
        }

        final var createdAccount = createAccount();

        return CreatedAccountModel.builder()
                .accountNumber(createdAccount.getAccountNumber())
                .name(model.getName())
                .branch(createdAccount.getBranch().toString())
                .status(createdAccount.getStatus())
                .type(createdAccount.getType())
                .build();
    }

    private Account createAccount() {
        final var account =  Account.builder()
                .id(UUID.randomUUID())
                .accountNumber(1020305)
                .branch(18190)
                .type(AccountType.CHECKING)
                .status(AccountStatus.ACTIVE).build();

        log.info("Salvando conta corrente ");
        this.accountProvider.createAccount(account);

        return account;
    }

    private boolean atendeAosrequisitosParaAbrirContaNoBancoPamela(final CreateAccountModel  model) {
        if (model.getAge() > 16 && model.getIncome() > 500) {
            return true;
        }
        return false;
    }
}