package com.JDBCTASK.CustomerDEMO.controller;

import com.JDBCTASK.CustomerDEMO.serviceImpl.CustomerImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class CustomerController {
    private final CustomerImpl customerDao;

    public CustomerController(CustomerImpl customerDao) {
        this.customerDao = customerDao;
    }
    @GetMapping(params = "product")
    public List<String> getCustomersByProductName(@RequestParam String product) {
        return customerDao.findCustomerNamesByProductName(product);
    }
}
