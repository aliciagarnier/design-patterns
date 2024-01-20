package org.example.chainofresponsability;

import java.math.BigDecimal;

public class CarDiscountFIAT extends CarDiscount {
    public CarDiscountFIAT(CarDiscount nextCarDiscount) {
        super(nextCarDiscount);
    }

    @Override
    public BigDecimal applyDiscount(Car car) {
      BigDecimal saleValue = car.getPrice();

        if(car.getBrand() == Brand.FIAT)
        {
           return saleValue.subtract(new BigDecimal(1000));
        }

        saleValue = nextCarDiscount.applyDiscount(car);
        return saleValue;
    }
}
