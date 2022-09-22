package com.method.digitalbank.interfacesadapters.gateway.database.repository;

import com.method.digitalbank.interfacesadapters.gateway.database.domain.AccountData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<AccountData, String> {

    Optional<AccountData> findFirstByAccountNumberAndStatus(final Integer accountNumber, final String status);
}

