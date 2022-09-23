package com.method.digitalbank.interfacesadapters.controllers;

import com.method.digitalbank.usecases.dto.CreateAccountModel;
import com.method.digitalbank.usecases.dto.CreatedAccountModel;
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
    public CreatedAccountModel execute(@RequestBody final CreateAccountModel model){

        return interactor.execute(model);
    }
}
