package com.ordering.testOrderSystem.entity;

import javax.persistence.*;

@Entity
@Table(name = "sauce")
public class Sauce {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int sauceID;

    @Column(name = "sauceName")
    private String sauceName;

    @Column(name = "category")
    private String sauceCategory;

    @Column(name = "calories")
    private int sauceCalories;

    @Column(name = "type")
    private String sauceType;

    public Sauce() {
    }

    public Sauce(String sauceName, String sauceCategory, int sauceCalories, String sauceType) {
        this.sauceName = sauceName;
        this.sauceCategory = sauceCategory;
        this.sauceCalories = sauceCalories;
        this.sauceType = sauceType;
    }

    public int getSauceID() {
        return sauceID;
    }

    public void setSauceID(int sauceID) {
        this.sauceID = sauceID;
    }

    public String getSauceName() {
        return sauceName;
    }

    public void setSauceName(String sauceName) {
        this.sauceName = sauceName;
    }

    public String getSauceCategory() {
        return sauceCategory;
    }

    public void setSauceCategory(String sauceCategory) {
        this.sauceCategory = sauceCategory;
    }

    public int getSauceCalories() {
        return sauceCalories;
    }

    public void setSauceCalories(int sauceCalories) {
        this.sauceCalories = sauceCalories;
    }

    public String getSauceType() {
        return sauceType;
    }

    public void setSauceType(String sauceType) {
        this.sauceType = sauceType;
    }

    @Override
    public String toString() {
        return "Sauce{" +
                "sauceID=" + sauceID +
                ", sauceName='" + sauceName + '\'' +
                ", sauceCategory='" + sauceCategory + '\'' +
                ", sauceCalories=" + sauceCalories +
                ", sauceType='" + sauceType + '\'' +
                '}';
    }
}
