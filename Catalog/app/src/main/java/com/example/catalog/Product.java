package com.example.catalog;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private String price;
    private int imageID;


    public Product(String name, String price, int imageID) {
        this.name = name;
        this.price = price;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }


}
