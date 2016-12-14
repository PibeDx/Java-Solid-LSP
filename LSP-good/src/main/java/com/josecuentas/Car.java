package com.josecuentas;

/**
 * Created by jcuentast on 14/12/16.
 */
public class Car extends Vehicle {

    int engageIgnition;

    @Override
    void startEngine() {
        this.engageIgnition();
        super.startEngine();
    }

    private void engageIgnition() {
        // Ignition procedure
        engageIgnition = 1;
    }
}
