package com.Lokesh.Day4;

/**
 *                   Pojo means pure old java Object.
 * ___________ Every Object in Java Application Must Follow POJO Rules.
 *
 * POJO stands for Plain Old Java Object. It is an ordinary Java object,
 * not bound by any special restriction other than those forced by the Java
 * Language Specification and not requiring any classpath. POJOs are used for
 * increasing the readability and re-usability of a program.
 *
 * The POJO class must be public. It must have a public default constructor. It may have the argument constructor.
 * All objects must have some public Getters and Setters to access the object values by other Java Programs.
 *
 * POJO Class must be public.
 * POJO Class properties(variable) must be private.
 * POJO Class  must have public default constructor. ( Can also have args constructor ).
 * POJO Class Every property(variable) should have public Getter and Setter method.
 *
 * POJO Class can't extend any other class
 * Pojo Class can't implement any external interface.
 *
 */

public class CarPojo {
    private int colour;
    private String brand;
    private long price;


    public int getColour() {
        return colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
