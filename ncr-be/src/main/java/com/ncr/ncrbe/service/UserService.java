package com.ncr.ncrbe.service;

import com.ncr.ncrbe.model.Customer;
import org.springframework.stereotype.Service;

/**
 * Created by Family on 12/24/2019.
 */
@Service
public class UserService {
    public Customer newCustomer(Customer customer) {
        customer.setLpid("asdef2424f");
        return customer;
    }
}
