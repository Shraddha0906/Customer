package com.JDBCTASK.CustomerDEMO.service;

import com.JDBCTASK.CustomerDEMO.serviceImpl.CustomerImpl;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CustomerService implements CustomerImpl {
    private final JdbcTemplate jdbcTemplate;
    public CustomerService(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
    public List<String> findCustomerNamesByProductName(String productName) {
        String sql = "SELECT c.name FROM customers c "
                + "JOIN cust_mapping cp ON cp.customers_id = c.id "
                + "JOIN products p ON cp.products_id = p.id "
                + "WHERE p.name = ?";

        return jdbcTemplate.queryForList(sql, String.class, productName);
    }
}
