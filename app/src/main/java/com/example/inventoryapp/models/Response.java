package com.example.inventoryapp.models;

public class Response {
    private  boolean status;
    private String message;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Response(boolean status, String message) {
        this.status = status;
        this.message = message;
    }
}
