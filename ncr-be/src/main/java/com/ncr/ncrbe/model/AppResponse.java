package com.ncr.ncrbe.model;

import java.util.List;

/**
 * Created by Family on 12/23/2019.
 */
public class AppResponse {
    public List getItems() {
        return items;
    }

    public void setItems(List items) {
        this.items = items;
    }

    public AppError getError() {
        return error;
    }

    public void setError(AppError error) {
        this.error = error;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    private Object response;
    private List items;
    private AppError error;
}
