package com.wubinben.intellij.wrapReturnValue;

public class Order {
    String customer;

    Customer getCustomer() {
        return new Customer(customer);
    }
}
