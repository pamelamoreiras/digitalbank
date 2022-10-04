package com.method.digitalbank.interfacesadapters.controllers.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PreCreateCustomerRequest {

    private UUID id;
    @NotBlank
    private String name;
    @NotBlank
    private String email;
    @NotBlank
    private String documentNumber;
    @NotBlank
    private String phoneNumber;
    @NotBlank
    private String password;
}
