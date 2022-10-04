package com.method.digitalbank.interfacesadapters.controllers;

import com.method.digitalbank.interfacesadapters.controllers.request.CreateAccountRequest;
import com.method.digitalbank.interfacesadapters.controllers.response.CreateAccountResponse;
import com.method.digitalbank.interfacesadapters.database.mappers.ConverterOfAccount;
import com.method.digitalbank.usecases.interactors.CreateAccountInteractor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/create")
@RequiredArgsConstructor
public class CreateAccountController {

    private final CreateAccountInteractor interactor;

    @PostMapping
    public CreateAccountResponse execute(@RequestBody final CreateAccountRequest request){

        final var paraConverter = ConverterOfAccount.converterCreateRequestToCreateModel(request);

        final var paraRetornar = interactor.execute(paraConverter);

        return ConverterOfAccount.converterCreatedModelToCreateResponse(paraRetornar);
    }
}
