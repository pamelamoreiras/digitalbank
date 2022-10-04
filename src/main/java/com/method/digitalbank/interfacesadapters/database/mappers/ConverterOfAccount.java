package com.method.digitalbank.interfacesadapters.database.mappers;

import com.method.digitalbank.entitydomain.Account;
import com.method.digitalbank.entitydomain.Customer;
import com.method.digitalbank.interfacesadapters.controllers.request.CreateAccountRequest;
import com.method.digitalbank.interfacesadapters.controllers.request.PreCreateCustomerRequest;
import com.method.digitalbank.interfacesadapters.controllers.response.CreateAccountResponse;
import com.method.digitalbank.interfacesadapters.database.entitydatabase.AccountData;
import com.method.digitalbank.interfacesadapters.database.entitydatabase.CustomerData;
import com.method.digitalbank.usecases.dto.CreateAccountModel;
import com.method.digitalbank.usecases.dto.CreatedAccountModel;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class ConverterOfAccount {

    public static CreatedAccountModel converterAccountToCreatedAccountModel(final Account account){
        return CreatedAccountModel.builder()
                .id(account.getId())
                .type(account.getType())
                .accountNumber(account.getAccountNumber())
                .branch(account.getBranch())
                .status(account.getStatus())
                .build();
    }

    public static AccountData converterAccountToAccountData(final Account account){
        return AccountData.builder()
                .id(account.getId().toString())
                .customerData(converterCustomerToCustomerData(account.getCustomer()))
                .type(account.getType())
                .branch(account.getBranch())
                .accountNumber(account.getAccountNumber())
                .status(account.getStatus())
                .build();
    }

    public static CreateAccountModel converterCreateRequestToCreateModel(CreateAccountRequest request) {
        return CreateAccountModel.builder()
                .id(request.getId())
                .name(request.getName())
                .email(request.getEmail())
                .documentNumber(request.getDocumentNumber())
                .phoneNumber(request.getPhoneNumber())
                .password(request.getPassword())
                .build();
    }

    public static CreateAccountResponse converterCreatedModelToCreateResponse(CreatedAccountModel model) {
        return CreateAccountResponse.builder()
                .id(model.getId())
                .type(model.getType())
                .accountNumber(model.getAccountNumber())
                .branch(model.getBranch())
                .status(model.getStatus())
                .build();
    }

    public static CustomerData converterCustomerToCustomerData(final Customer customer){
        return CustomerData.builder()
                .id(customer.getId().toString())
                .name(customer.getName())
                .email(customer.getEmail())
                .documentNumber(customer.getDocumentNumber())
                .documentNumber(customer.getDocumentNumber())
                .phoneNumber(customer.getPhoneNumber())
                .password(customer.getPassword())
                .build();
    }

    public static Customer converterCustomerDataToCustomer(final CustomerData customerData){
        return Customer.builder()
                .id(UUID.fromString(customerData.getId()))
                .name(customerData.getName())
                .email(customerData.getEmail())
                .documentNumber(customerData.getDocumentNumber())
                .documentNumber(customerData.getDocumentNumber())
                .phoneNumber(customerData.getPhoneNumber())
                .password(customerData.getPassword())
                .build();
    }

    public static CreateAccountModel converterPreCustomerRequestToCreateModel(final PreCreateCustomerRequest request){
        return CreateAccountModel.builder()
                .id(request.getId())
                .name(request.getName())
                .email(request.getEmail())
                .documentNumber(request.getDocumentNumber())
                .phoneNumber(request.getPhoneNumber())
                .password(request.getPassword())
                .build();
    }
}
