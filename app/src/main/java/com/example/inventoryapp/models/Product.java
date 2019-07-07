package com.example.inventoryapp.models;

public class Product {
    private String pname,ptype,psize,price,quantity,image;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public String getPsize() {
        return psize;
    }

    public void setPsize(String psize) {
        this.psize = psize;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Product(String pname, String ptype, String psize, String price, String quantity, String image) {
        this.pname = pname;
        this.ptype = ptype;
        this.psize = psize;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
    }
}
