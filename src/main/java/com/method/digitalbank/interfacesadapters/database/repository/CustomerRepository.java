package com.method.digitalbank.interfacesadapters.database.repository;

import com.method.digitalbank.interfacesadapters.database.domain.CustomerData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerData, String> {

    Optional<CustomerData> findByDocumentNumber(final String documentNumber);

}
