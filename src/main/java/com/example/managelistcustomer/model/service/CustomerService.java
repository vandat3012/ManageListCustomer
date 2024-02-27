package com.example.managelistcustomer.model.service;

import com.example.managelistcustomer.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService {
    private final List<Customer> customerList;
    public CustomerService() {
        customerList = new ArrayList<>();
        customerList.add(new Customer(1,"nhat","nhat@","QT"));
        customerList.add(new Customer(2,"dat","dat@","HT"));
        customerList.add(new Customer(3,"phap","phap@","QT"));
        customerList.add(new Customer(4,"dung","dung@","QT"));
    }

    @Override
    public List<Customer> findAll() {
        return customerList ;
    }

    @Override
    public Customer findById(int id) {
        for (Customer c : customerList) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void save(Customer customer) {
        Customer c = findById(customer.getId());
        c.setName(customer.getName());
        c.setEmail(customer.getEmail());
        c.setAddress(customer.getAddress());
    }
}
