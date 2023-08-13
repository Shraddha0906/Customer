package com.JDBCTASK.CustomerDEMO.serviceImpl;

import java.util.List;

public interface CustomerImpl {
    List<String> findCustomerNamesByProductName(String productName);
}
