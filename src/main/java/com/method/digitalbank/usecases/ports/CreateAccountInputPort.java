package com.method.digitalbank.usecases.ports;

import com.method.digitalbank.usecases.dto.CreateAccountModel;
import com.method.digitalbank.usecases.dto.CreatedAccountModel;

public interface CreateAccountInputPort {

    CreatedAccountModel execute(final CreateAccountModel model);
}
