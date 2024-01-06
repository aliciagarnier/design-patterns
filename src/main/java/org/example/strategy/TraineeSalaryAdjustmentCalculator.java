package org.example.strategy;

import java.math.BigDecimal;

public class TraineeSalaryAdjustmentCalculator implements SalaryAdjustmentCalculator {
    @Override
    public BigDecimal calculateAnnualAdjustment(Employee employee) {
        return BigDecimal.valueOf(employee.getSalary().doubleValue() * 1.1);

    }
}
