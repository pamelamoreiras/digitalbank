package com.method.digitalbank.interfacesadapters.gateway.database.repository;

import com.method.digitalbank.interfacesadapters.gateway.database.domain.AddressData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressData, String> {
}
