package com.method.digitalbank.interfacesadapters.gateway.database.repository;


import com.method.digitalbank.interfacesadapters.gateway.database.domain.CustomerData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerData, String> {
}
