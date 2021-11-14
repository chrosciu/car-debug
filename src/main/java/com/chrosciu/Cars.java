package com.chrosciu;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static com.chrosciu.Color.BLACK;
import static com.chrosciu.Color.GOLDEN;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Cars {
    public static final Car FIAT = new Car(GOLDEN, "Fiat Punto", 5000);
    public static final Car TOYOTA = new HybridCar(BLACK, "Toyota Prius", 100000);
}
