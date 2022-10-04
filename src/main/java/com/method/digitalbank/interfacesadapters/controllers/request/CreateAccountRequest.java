package com.method.digitalbank.interfacesadapters.controllers.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateAccountRequest {

    private UUID id;
    private String name;
    private String email;
    private String documentNumber;
    private String phoneNumber;
    private String password;
}
