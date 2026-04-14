package com.shopcart.entities;

import java.util.ArrayList;
import java.util.List;


public class Cart {
    private int id;
    private List<Product> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }

}
