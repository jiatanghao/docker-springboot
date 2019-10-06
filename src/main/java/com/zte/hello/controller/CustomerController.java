package com.zte.hello.controller;

import com.zte.hello.pojo.Customer;
import com.zte.hello.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/")
    public @ResponseBody List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping("/")
    public @ResponseBody boolean addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }
}
