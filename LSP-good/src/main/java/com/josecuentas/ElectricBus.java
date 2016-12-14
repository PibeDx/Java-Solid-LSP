package com.josecuentas;

/**
 * Created by jcuentast on 14/12/16.
 */
public class ElectricBus extends Vehicle {

    int voltage;
    int connectionIndividualEngines;

    @Override
    void accelerate() {
        //super.accelerate();
        this.increaseVoltage();
        this.connectIndividualEngines();
    }

    private void increaseVoltage() {
        // Electric logic
        voltage += 1;
    }

    private void connectIndividualEngines() {
        // Connection logic
        this.connectionIndividualEngines = 1;
    }
}
