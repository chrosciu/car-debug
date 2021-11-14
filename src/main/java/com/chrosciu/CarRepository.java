package com.chrosciu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarRepository {
    private final Map<String, Car> cars = new HashMap<>();

    public boolean add(Car car) {
        if (!cars.containsKey(car.getModel())) {
            cars.put(car.getModel(), car);
            return true;
        } else {
            return false;
        }
    }

    public List<Car> getAll() {
        return List.copyOf(cars.values());
    }
}
