package com.ncr.ncrbe.controller;

import com.ncr.ncrbe.model.AppResponse;
import com.ncr.ncrbe.model.AuthResponse;
import com.ncr.ncrbe.model.AuthUser;
import com.ncr.ncrbe.model.Customer;
import com.ncr.ncrbe.service.TellerService;
import com.ncr.ncrbe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Family on 12/22/2019.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("newCustomer")
    public AppResponse newCustomer(@RequestBody Customer customer) {
        // return true if both emaild & pwd are there
        Customer customerAfterCreate = userService.newCustomer(customer);
        AppResponse appResponse = new AppResponse();
        appResponse.setResponse(customerAfterCreate);
        return appResponse;
    }
}
