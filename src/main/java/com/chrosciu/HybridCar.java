package com.chrosciu;

import static com.chrosciu.EngineState.BROKEN;

public class HybridCar extends Car {
    public HybridCar(Color color, String model, long price) {
        super(color, model, price);
    }

    protected void start() {
        super.start();
        engineState = BROKEN;
    }

    @Override
    public EngineState getEngineState() {
        System.out.println("Haha, this probably will be broken :)");
        return BROKEN;
    }
}
