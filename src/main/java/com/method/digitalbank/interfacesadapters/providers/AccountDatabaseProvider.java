package com.method.digitalbank.interfacesadapters.providers;

import com.method.digitalbank.entity.Account;
import com.method.digitalbank.entity.enums.AccountStatus;
import com.method.digitalbank.interfacesadapters.gateway.database.domain.AccountData;
import com.method.digitalbank.interfacesadapters.gateway.database.repository.AccountRepository;
import com.method.digitalbank.usecase.providers.AccountProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class AccountDatabaseProvider implements AccountProvider {

    private final AccountRepository accountRepository;

    @Override
    public boolean isActiveAccount(Account account) throws ChangeSetPersister.NotFoundException {

        final var empty = accountRepository.findFirstByAccountNumberAndStatus(account.getAccountNumber(), AccountStatus.ACTIVE.name())
                .isEmpty();

        if (!empty) {
            return true;
        }

        return false;
    }
    @Override
    public void createAccount(Account account) {
        final var accountToCreate = AccountData.builder()
                .id(account.getId().toString())
                .account(account.getAccountNumber())
                .branch(account.getBranch())
                .build();
        accountRepository.save(accountToCreate);
    }
}
