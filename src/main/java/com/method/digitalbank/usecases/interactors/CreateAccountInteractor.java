package com.method.digitalbank.usecases.interactors;

import com.method.digitalbank.entitydomain.Account;
import com.method.digitalbank.entitydomain.Customer;
import com.method.digitalbank.entitydomain.enums.AccountStatus;
import com.method.digitalbank.entitydomain.enums.AccountType;
import com.method.digitalbank.interfacesadapters.database.mappers.ConverterOfAccount;
import com.method.digitalbank.usecases.dto.CreateAccountModel;
import com.method.digitalbank.usecases.dto.CreatedAccountModel;
import com.method.digitalbank.usecases.ports.CreateAccountInputPort;
import com.method.digitalbank.usecases.providers.AccountProvider;
import com.method.digitalbank.usecases.providers.CustomerProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class CreateAccountInteractor implements CreateAccountInputPort {

    private final AccountProvider accountProvider;
    private final CustomerProvider customerProvider;

    @Override
    public CreatedAccountModel execute(final CreateAccountModel model) {
        log.info("Start create account");

        var account = Account.builder().build();

        Customer customer = customerProvider.getCustomer(model.getDocumentNumber());

        if (!customer.getDocumentNumber().isEmpty()) {
            account = Account.builder()
                    .id(UUID.randomUUID())
                    .customer(customer)
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
