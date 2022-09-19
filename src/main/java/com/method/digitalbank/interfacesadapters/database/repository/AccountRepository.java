package com.method.digitalbank.interfacesadapters.database.repository;

import com.method.digitalbank.interfacesadapters.database.domain.AccountData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountData, Integer> {
}
