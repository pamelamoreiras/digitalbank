package com.method.digitalbank.interfacesadapters.database.repository;

import com.method.digitalbank.interfacesadapters.database.domain.CustomerData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerData, Integer> {
}
