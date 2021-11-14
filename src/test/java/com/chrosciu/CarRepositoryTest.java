package com.chrosciu;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.chrosciu.Color.GOLDEN;

public class CarRepositoryTest {

    @Test
    @SneakyThrows
    public void shouldNotAllowToAddTheSameCarTwice() {
        CarRepository carRepository = new CarRepository();
        Car car = new Car(GOLDEN, "Fiat Punto", 5000);
        List<Boolean> results = new ArrayList<>();

        Runnable action = () -> {
            boolean result = carRepository.add(car);
            results.add(result);
        };

        Thread t1 = new Thread(action);
        Thread t2 = new Thread(action);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        boolean addedTwice = results.stream().allMatch(b -> b);
        Assertions.assertFalse(addedTwice);
    }



}
