package com.ncr.ncrbe.model;

/**
 * Created by Family on 12/23/2019.
 */
public class AppError {
    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    private Integer errorCode;
    private String errorMessage;
}
