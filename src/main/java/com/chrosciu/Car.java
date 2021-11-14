package com.chrosciu;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import static com.chrosciu.EngineState.STARTED;
import static com.chrosciu.EngineState.STOPPED;


@RequiredArgsConstructor
@Getter
@ToString
public class Car implements WithEngine {
    private final Color color;
    private final String model;
    private final long price;

    protected EngineState engineState = STOPPED;

    protected void start() {
        engineState = STARTED;
    }

    protected void stop() {
        engineState = STOPPED;
    }

    public void drive() {
        start();
        if (STARTED == engineState) {
            System.out.println("Driving !");
        } else {
            throw new IllegalStateException("Cannot drive on not started engine !");
        }
        stop();
    }

}
