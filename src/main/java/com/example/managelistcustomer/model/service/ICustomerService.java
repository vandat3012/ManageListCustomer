package com.example.managelistcustomer.model.service;

import com.example.managelistcustomer.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    Customer findById(int id);
    void save(Customer customer);
}
