package com.chrosciu;

import java.util.List;
import java.util.Scanner;

import static com.chrosciu.Color.BLACK;
import static com.chrosciu.Color.GOLDEN;

class InputReader {
    private final Scanner scanner;

    public InputReader() {
        this.scanner = new Scanner(System.in);
    }

    public boolean hasToken() {
        return scanner.hasNext();
    }

    public String getToken() {
        return scanner.next();
    }
}

public class CarSearch {
    private final CarRepository carRepository;
    private final InputReader inputReader;

    public CarSearch() {
        this.carRepository = new CarRepository();
        carRepository.add(new Car(GOLDEN, "Fiat Punto", 5000));
        carRepository.add(new HybridCar(BLACK, "Toyota Prius", 100000));

        this.inputReader = new InputReader();
    }

    public void searchLoop() {
        while (inputReader.hasToken()) {
            String query = inputReader.getToken();

            List<Car> cars = carRepository.getAll();

            for (Car car: cars) {
                if (matches(car, query)) {
                    print(car);
                }
            }

            cars.stream().filter(c -> matches(c, query)).forEach(this::print);
        }
    }

    public static void main(String[] args) {
        new CarSearch().searchLoop();
    }

    private boolean matches(Car car, String query) {
        return car.getModel().contains(query);
    }

    private void print(Car car) {
        System.out.println("Found car: " + car);
    }
}
