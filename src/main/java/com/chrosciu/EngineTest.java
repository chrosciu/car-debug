package com.chrosciu;

import static com.chrosciu.Color.GOLDEN;

public class EngineTest {
    public static void main(String[] args) {
        WithEngine withEngine = new Car(GOLDEN, "Fiat Punto", 5000);
        System.out.println(withEngine.getEngineState());
    }
}
