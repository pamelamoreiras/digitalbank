package com.method.digitalbank.usecases.ports;

import com.method.digitalbank.usecases.dto.CreateAccountModel;

public interface PreCreateCustomerInputPort {

    void execute (CreateAccountModel model);
}
