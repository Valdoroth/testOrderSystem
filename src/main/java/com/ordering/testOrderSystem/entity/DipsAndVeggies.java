package com.ordering.testOrderSystem.entity;


import javax.persistence.*;

@Entity
@Table(name = "dips_and_veggies")
public class DipsAndVeggies {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int dipsID;

    @Column(name = "name")
    private String dipsName;

    @Column(name = "price")
    private int dipsPrice;

    @Column(name = "calories")
    private int dipsCalories;

    @Column(name = "type")
    private String dipsType;

    public DipsAndVeggies() {
    }

    public DipsAndVeggies(String dipsName, int dipsPrice, int dipsCalories, String dipsType) {
        this.dipsName = dipsName;
        this.dipsPrice = dipsPrice;
        this.dipsCalories = dipsCalories;
        this.dipsType = dipsType;
    }

    public int getDipsID() {
        return dipsID;
    }

    public void setDipsID(int dipsID) {
        this.dipsID = dipsID;
    }

    public String getDipsName() {
        return dipsName;
    }

    public void setDipsName(String dipsName) {
        this.dipsName = dipsName;
    }

    public int getDipsPrice() {
        return dipsPrice;
    }

    public void setDipsPrice(int dipsPrice) {
        this.dipsPrice = dipsPrice;
    }

    public int getDipsCalories() {
        return dipsCalories;
    }

    public void setDipsCalories(int dipsCalories) {
        this.dipsCalories = dipsCalories;
    }

    public String getDipsType() {
        return dipsType;
    }

    public void setDipsType(String dipsType) {
        this.dipsType = dipsType;
    }

    @Override
    public String toString() {
        return "DipsAndVeggies{" +
                "dipsID=" + dipsID +
                ", dipsName='" + dipsName + '\'' +
                ", dipsPrice=" + dipsPrice +
                ", dipsCalories=" + dipsCalories +
                ", dipsType='" + dipsType + '\'' +
                '}';
    }
}
