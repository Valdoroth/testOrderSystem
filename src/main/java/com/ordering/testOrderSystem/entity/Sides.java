package com.ordering.testOrderSystem.entity;

import javax.persistence.*;

@Entity
@Table(name = "sides")
public class Sides {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int sidesID;

    @Column(name = "name")
    private String sidesName;

    @Column(name = "price")
    private double sidesPrice;

    @Column(name = "calories")
    private int sidesCalories;

    public int getSidesID() {
        return sidesID;
    }

    public void setSidesID(int sidesID) {
        this.sidesID = sidesID;
    }

    public String getSidesName() {
        return sidesName;
    }

    public void setSidesName(String sidesName) {
        this.sidesName = sidesName;
    }

    public double getSidesPrice() {
        return sidesPrice;
    }

    public void setSidesPrice(double sidesPrice) {
        this.sidesPrice = sidesPrice;
    }

    public int getSidesCalories() {
        return sidesCalories;
    }

    public void setSidesCalories(int sidesCalories) {
        this.sidesCalories = sidesCalories;
    }

    @Override
    public String toString() {
        return "Sides{" +
                "sidesID=" + sidesID +
                ", sidesName='" + sidesName + '\'' +
                ", sidesPrice=" + sidesPrice +
                ", sidesCalories=" + sidesCalories +
                '}';
    }
}
