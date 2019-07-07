package com.example.inventoryapp.models;

public class Order {
    private String vendorid,productid,quantity,price,credit;

    public Order(String vendorid, String productid, String quantity, String price, String credit) {
        this.vendorid = vendorid;
        this.productid = productid;
        this.quantity = quantity;
        this.price = price;
        this.credit = credit;
    }

    public String getVendorid() {
        return vendorid;
    }

    public void setVendorid(String vendorid) {
        this.vendorid = vendorid;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }
}
