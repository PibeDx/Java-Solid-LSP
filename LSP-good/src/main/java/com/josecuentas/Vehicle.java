package com.josecuentas;

/**
 * Created by jcuentast on 14/12/16.
 */
public class Vehicle {

    public int start;

    public Vehicle() {
        this.start = 0;
    }

    void startEngine() {
        this.start = 1;
    }

    void accelerate() {
        this.start += 1;
    }
}
