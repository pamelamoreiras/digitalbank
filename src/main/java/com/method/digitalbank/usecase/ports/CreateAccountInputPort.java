package com.method.digitalbank.usecase.ports;

import com.method.digitalbank.usecase.dto.CreateAccountModel;
import com.method.digitalbank.usecase.dto.CreatedAccountModel;

public interface CreateAccountInputPort {

    CreatedAccountModel execute(final CreateAccountModel model);
}
