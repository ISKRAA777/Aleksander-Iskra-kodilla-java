package com.kodilla.good.patterns.challenges.ProductOrderService_0902;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String surname;
    private String address;
    private int money;
    private List<Product> staff;

    public User(String name, String surname, String address, int money) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.money = money;
        staff = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public int getMoney() {
        return money;
    }

    public List<Product> getStaff() {
        return staff;
    }

    public void setStaff(List<Product> staff) {
        this.staff = staff;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void addStaff(Product product) {
        staff.add(product);
    }
}
