package com.chrosciu;

import static com.chrosciu.Color.BLACK;

public class HybridDrive {
    public static void main(String[] args) {
        Car car = new HybridCar(BLACK, "Toyota Prius", 100000);
        car.drive();
    }
}
