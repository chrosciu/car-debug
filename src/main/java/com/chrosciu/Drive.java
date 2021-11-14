package com.chrosciu;

import static com.chrosciu.Color.GOLDEN;

public class Drive {
    public static void main(String[] args) {
        Car car = new Car(GOLDEN, "Fiat Punto", 5000);
        car.drive();
    }
}
