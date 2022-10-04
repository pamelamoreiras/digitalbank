package com.method.digitalbank.interfacesadapters.controllers;

import com.method.digitalbank.interfacesadapters.controllers.request.PreCreateCustomerRequest;
import com.method.digitalbank.interfacesadapters.database.mappers.ConverterOfAccount;
import com.method.digitalbank.usecases.ports.PreCreateCustomerInputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/digitalbank/customer")
public class PreCreateCustomerController {

    private final PreCreateCustomerInputPort inputPort;

    @PostMapping
    public void createCustomer(@RequestBody  final PreCreateCustomerRequest request){
        final var createAccountModel = ConverterOfAccount.converterPreCustomerRequestToCreateModel(request);

        inputPort.execute(createAccountModel);
    }
}
