package com.ordering.testOrderSystem.entity;

import javax.persistence.*;

@Entity
@Table(name = "burgers")
public class Burgers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int burgerID;

    @Column(name = "name")
    private String burgerName;

    @Column(name = "price")
    private double burgerPrice;

    @Column(name = "calories")
    private int burgerCalories;

    public Burgers() {
    }

    public Burgers(String burgerName, double burgerPrice, int burgerCalories) {
        this.burgerName = burgerName;
        this.burgerPrice = burgerPrice;
        this.burgerCalories = burgerCalories;
    }

    public int getBurgerID() {
        return burgerID;
    }

    public void setBurgerID(int burgerID) {
        this.burgerID = burgerID;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public double getBurgerPrice() {
        return burgerPrice;
    }

    public void setBurgerPrice(double burgerPrice) {
        this.burgerPrice = burgerPrice;
    }

    public int getBurgerCalories() {
        return burgerCalories;
    }

    public void setBurgerCalories(int burgerCalories) {
        this.burgerCalories = burgerCalories;
    }

    @Override
    public String toString() {
        return "Burgers{" +
                "burgerID=" + burgerID +
                ", burgerName='" + burgerName + '\'' +
                ", burgerPrice=" + burgerPrice +
                ", burgerCalories=" + burgerCalories +
                '}';
    }
}
