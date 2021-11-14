package com.chrosciu;

import java.util.List;

import static com.chrosciu.Cars.FIAT;
import static com.chrosciu.Cars.TOYOTA;

public class CarSearch {
    private final CarRepository carRepository;
    private final InputReader inputReader;

    public CarSearch() {
        this.carRepository = new CarRepository();
        carRepository.add(FIAT);
        carRepository.add(TOYOTA);

        this.inputReader = new InputReader();
    }

    public void searchLoop() {
        while (inputReader.hasToken()) {
            String query = inputReader.getToken();
            search(query);
        }
    }

    public static void main(String[] args) {
        new CarSearch().searchLoop();
    }

    private void search(String query) {
        List<Car> cars = carRepository.getAll();

        for (Car car: cars) {
            if (matches(car, query)) {
                print(car);
            }
        }
    }

    private boolean matches(Car car, String query) {
        return car.getModel().toLowerCase().contains(query.toLowerCase());
    }

    private void print(Car car) {
        System.out.println("Found car: " + car);
    }
}
