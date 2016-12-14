package com.josecuentas;

/**
 * Created by jcuentast on 14/12/16.
 */
public class Client {
    public boolean areaVerifier(Rectangle rectangle) throws Exception {
        rectangle.setWidth(5);
        rectangle.setHeight(4);

        if (rectangle.area() != 20) {
            throw new Exception("Bad area!");
        }

        return true;
    }
}
