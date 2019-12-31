package com.ncr.ncrbe.model;

/**
 * Created by Family on 12/15/2019.
 */
public class AuthResponse {
    private String email;
    private String token;
    private String expiry;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }
}
