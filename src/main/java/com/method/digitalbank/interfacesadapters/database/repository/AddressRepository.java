package com.method.digitalbank.interfacesadapters.database.repository;

import com.method.digitalbank.interfacesadapters.database.domain.AddressData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressData, Integer> {
}
