package com.method.digitalbank.usecases.interactors;

import com.method.digitalbank.entitydomain.Customer;
import com.method.digitalbank.usecases.dto.CreateAccountModel;
import com.method.digitalbank.usecases.ports.PreCreateCustomerInputPort;
import com.method.digitalbank.usecases.providers.CustomerProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class PreCreateCustomerInteractor implements PreCreateCustomerInputPort {

    private final CustomerProvider customerProvider;

    @Override
    public void execute(final CreateAccountModel model) {
        log.info("creating customer");

        final var customerToCreate = Customer.builder()
                .id(UUID.randomUUID())
                .name(model.getName())
                .email(model.getEmail())
                .documentNumber(model.getDocumentNumber())
                .phoneNumber(model.getPhoneNumber())
                .password(model.getPassword())
                .build();

        customerProvider.preCreateCustomer(customerToCreate);
    }
}
