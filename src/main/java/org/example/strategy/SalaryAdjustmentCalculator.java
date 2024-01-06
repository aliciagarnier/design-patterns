package org.example.strategy;

import java.math.BigDecimal;

public interface SalaryAdjustmentCalculator {

    public BigDecimal calculateAnnualAdjustment (Employee employee);
}
