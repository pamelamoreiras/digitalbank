package com.method.digitalbank.usecases.providers;

import com.method.digitalbank.entity.Account;

public interface AccountProvider {

    void createAccount (final Account account);

    boolean findAccountByDocumentNumber(final String documentNumber);
}
