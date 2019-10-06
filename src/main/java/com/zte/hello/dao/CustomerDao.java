package com.zte.hello.dao;

import com.zte.hello.pojo.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDao {
    @Select("SELECT customer_id, customer_name, birthday FROM customer")
    @Results({
            @Result(id = true, column = "customer_id", property = "customerId"),
            @Result(column = "customer_name", property = "customerName"),
            @Result(column = "birthday", property = "birthday")
    })
    List<Customer> getAllCustomers();
    List<Customer> getCustomersByName(String name);
    Customer getCustomerById(String id);
    @Insert("INSERT INTO customer(customer_id, customer_name, birthday)" +
            " VALUES(#{customerId}, #{customerName}, #{birthday})")
    boolean addCustomer(Customer customer);
    boolean deleteCustomerById(String id);
}
