package com.ncr.ncrbe.service;

import com.ncr.ncrbe.model.AppError;
import com.ncr.ncrbe.model.AppResponse;
import com.ncr.ncrbe.model.Customer;
import com.ncr.ncrbe.util.ErrorCodes;
import org.springframework.stereotype.Service;

/**
 * Created by Family on 12/25/2019.
 */
@Service
public class RegisterService {
    public AppResponse registerCustomer(Customer customer) {
        String namePattern="[a-z A-Z]+";
        AppResponse appResponse = new AppResponse();

        if (customer.getName() !=null && customer.getName().matches(namePattern)) {
            customer.setLpid("asdef2424f");
        } else {
            AppError appError = new AppError();
            appError.setErrorCode(ErrorCodes.INVALID_NAME);
            appError.setErrorMessage("you entered Invalid Name");
            appResponse.setError(appError);
        }
        return appResponse;
    }
}
