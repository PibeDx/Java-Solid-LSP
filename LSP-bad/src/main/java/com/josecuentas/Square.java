package com.josecuentas;

/**
 * Created by jcuentast on 14/12/16.
 */
public class Square extends Rectangle {

    @Override
    public void setHeight(float value) {
        this.width = value;
        this.height = value;
    }

    @Override
    public void setWidth(float value) {
        this.width = value;
        this.height = value;
    }
}
