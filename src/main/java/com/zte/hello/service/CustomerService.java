package com.zte.hello.service;

import com.zte.hello.dao.CustomerDao;
import com.zte.hello.pojo.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }

    public boolean addCustomer(Customer customer) {
        return customerDao.addCustomer(customer);
    }
}
