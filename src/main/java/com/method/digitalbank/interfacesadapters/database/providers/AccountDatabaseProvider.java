package com.method.digitalbank.interfacesadapters.database.providers;

import com.method.digitalbank.entity.Account;
import com.method.digitalbank.interfacesadapters.database.mappers.ConverterOfAccount;
import com.method.digitalbank.interfacesadapters.database.repository.AccountRepository;
import com.method.digitalbank.usecases.providers.AccountProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Slf4j
public class AccountDatabaseProvider implements AccountProvider {

    private final AccountRepository repository;
    @Override
    public void createAccount(final Account account) {

        final var accountData = ConverterOfAccount.converterAccountToAccountData(account);

        repository.save(accountData);

        log.info("Account created successfully");
    }

    @Override
    public boolean findAccountByDocumentNumber(final String documentNumber) {

        return repository.findByDocumentNumber(documentNumber).isPresent();
    }

    public Account findAccountByDocumentNumber2(final String documentNumber) {
        return repository.findByDocumentNumber(documentNumber)
                .map(ConverterOfAccount::converterAccountDataToAccount)
                .orElseThrow(() -> {
                    log.info("Não existe conta para o documento informado");
                    return new RuntimeException();
                });
    }
}
