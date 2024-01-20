package org.example.chainofresponsability;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter

public class Car {

    private String model;

    private Brand brand;

    private BigDecimal price;

}
