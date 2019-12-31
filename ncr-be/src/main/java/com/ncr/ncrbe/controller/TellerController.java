package com.ncr.ncrbe.controller;

import com.ncr.ncrbe.model.Teller;
import com.ncr.ncrbe.service.TellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Family on 12/1/2019.
 */
@RestController
public class TellerController {
    @Autowired
    private TellerService tellerService;

    @GetMapping("getTellerById")
    public Teller getTellerById(@RequestParam String tellerId) {
        Teller teller = tellerService.getTellerById(tellerId);
        teller.setBranchId("BRINCONTR");
        return teller;
    }
}
