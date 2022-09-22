package com.method.digitalbank.usecase.providers;

import com.method.digitalbank.entity.Account;
import org.springframework.data.crossstore.ChangeSetPersister;

public interface AccountProvider {

    boolean isActiveAccount(Account account) throws ChangeSetPersister.NotFoundException;

    void createAccount(final Account account);
}
