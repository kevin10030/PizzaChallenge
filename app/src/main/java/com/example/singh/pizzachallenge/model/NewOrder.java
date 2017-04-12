package com.example.singh.pizzachallenge.model;

import java.util.List;

/**
 * Created by singh on 12-Apr-17.
 */

public class NewOrder {

    private String username;
    private String phone;
    private List<String> toppings;
    private int quantity;
    private boolean favourite;

    public NewOrder(String username, String phone, List<String> toppings, int quantity, boolean favourite) {
        this.username = username;
        this.phone = phone;
        this.toppings = toppings;
        this.quantity = quantity;
        this.favourite = favourite;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}