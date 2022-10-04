package com.method.digitalbank.interfacesadapters.database.providers;

import com.method.digitalbank.entitydomain.Customer;
import com.method.digitalbank.interfacesadapters.database.mappers.ConverterOfAccount;
import com.method.digitalbank.interfacesadapters.database.repository.CustomerRepository;
import com.method.digitalbank.usecases.providers.CustomerProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class CustomerDatabaseProvider implements CustomerProvider {

    private final CustomerRepository customerRepository;

    @Override
    public void preCreateCustomer(Customer customer) {
        final var customerData = ConverterOfAccount.converterCustomerToCustomerData(customer);

        customerRepository.save(customerData);

        log.info("Customer pre created successfully");
    }

    @Override
    public Customer getCustomer(String documentNumber) {
        return customerRepository.findByDocumentNumber(documentNumber)
                .map(ConverterOfAccount::converterCustomerDataToCustomer)
                .orElseThrow();
    }
}
