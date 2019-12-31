package com.ncr.ncrbe.service;

import com.ncr.ncrbe.model.Teller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Family on 12/1/2019.
 */
@Service
public class TellerService {

    public Teller getTellerById(String tellerId) {
        Teller teller = new Teller();
        teller.setFirstName("Sowmya");
        teller.setLpId("SOW123");

        return teller;
    }
}
