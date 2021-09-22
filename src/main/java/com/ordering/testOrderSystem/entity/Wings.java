package com.ordering.testOrderSystem.entity;

import javax.persistence.*;

@Entity
@Table(name = "wings")
public class Wings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String type;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private double price;

    @Column(name = "calories")
    private int calories;

    public Wings() {

    }

    public Wings(String wingName, int wingQuantity, double wingPrice, int wingCalories) {
        this.type = wingName;
        this.quantity = wingQuantity;
        this.price = wingPrice;
        this.calories = wingCalories;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "\nWings{" +
                "wingsId=" + id +
                ", wingName='" + type + '\'' +
                ", wingQuantity=" + quantity +
                ", wingPrice=" + price +
                ", wingCalories=" + calories +
                '}';
    }
}
