package com.JDBCTASK.CustomerDEMO.model;

import java.util.ArrayList;
import java.util.List;

public class Customers {
    private Long id;
    private String name;
   private List<Products>productsList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }

    public void addProduct(Products products) {
        if (productsList== null) {
            productsList=new ArrayList<>();
        }
        productsList.add(products);
    }

}
