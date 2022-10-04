package com.method.digitalbank.usecases.providers;

import com.method.digitalbank.entitydomain.Account;
import com.method.digitalbank.usecases.dto.CreateAccountModel;

public interface AccountProvider {

    void createAccount (final Account account);

//    boolean findAccountByDocumentNumber(final String documentNumber);

    boolean findAccountByDocumentNumber(CreateAccountModel createModel);
}
