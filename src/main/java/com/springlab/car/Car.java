package com.springlab.car;

public class Car {
    private Long id;
    private String model;
    private int price;

    public Car(Long id, String model, int price) {
        this.id = id;
        this.model = model;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return this.getModel() + ": " + this.getPrice();
    }
}
