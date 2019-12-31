package com.ncr.ncrbe.controller;

import com.ncr.ncrbe.model.AuthResponse;
import com.ncr.ncrbe.model.AuthUser;
import com.ncr.ncrbe.model.Teller;
import com.ncr.ncrbe.service.TellerService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Family on 12/1/2019.
 */
@RestController
public class AuthController {
    @Autowired
    private TellerService tellerService;

    @PostMapping("authenticate")
    public AuthResponse authenticateUser(@RequestBody AuthUser authUser) {
        // return true if both emaild & pwd are there
        AuthResponse authResponse = new AuthResponse();
        if (authUser.getEmail() != null && authUser.getPassword() != null) {
            authResponse.setEmail(authUser.getEmail());
            authResponse.setToken("dahdhadgha");

        }
        return authResponse;
    }
}
