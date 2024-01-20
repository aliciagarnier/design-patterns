package org.example.chainofresponsability;

import java.math.BigDecimal;

public abstract class CarDiscount {
    protected CarDiscount nextCarDiscount;

    public CarDiscount(CarDiscount nextCarDiscount) {
        this.nextCarDiscount = nextCarDiscount;
    }

    public abstract BigDecimal applyDiscount(Car car);
}
