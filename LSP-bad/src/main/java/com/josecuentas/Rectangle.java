package com.josecuentas;

/**
 * Created by jcuentast on 14/12/16.
 */
public class Rectangle {

    float topLeft;
    float width;
    float height;

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    float area() {
        return this.width * this.height;
    }
}
