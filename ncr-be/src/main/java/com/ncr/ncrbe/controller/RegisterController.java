package com.ncr.ncrbe.controller;

import com.ncr.ncrbe.model.AppResponse;
import com.ncr.ncrbe.model.Customer;
import com.ncr.ncrbe.service.RegisterService;
import com.ncr.ncrbe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Family on 12/25/2019.
 */
@RestController
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @PostMapping("newRegister")
    public AppResponse registerCustomer( @RequestBody Customer customer) {
        return registerService.registerCustomer(customer);
    }
}


