package org.example.chainofresponsability;

import java.math.BigDecimal;

public class NoDiscount extends CarDiscount {
    public NoDiscount(CarDiscount nextCarDiscount) {
        super(nextCarDiscount);
    }

    @Override
    public BigDecimal applyDiscount(Car car) {
        return car.getPrice();
    }
}
