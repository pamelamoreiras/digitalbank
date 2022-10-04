package com.method.digitalbank.usecases.providers;

import com.method.digitalbank.entitydomain.Customer;

public interface CustomerProvider {

    Customer getCustomer(final String documentNumber);

    void preCreateCustomer(final Customer customer);
}
