package com.example.inventoryapp.models;

public class Vendor {
    private String fullname, company, address, phonenumber;

    public Vendor(String fullname, String company, String address, String phonenumber) {
        this.fullname = fullname;
        this.company = company;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
