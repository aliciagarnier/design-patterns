package org.example.strategy;

import java.math.BigDecimal;

public class AnnualSalaryAdjustment { // open-closed

    private SalaryAdjustmentCalculator salaryAdjustmentCalculator;

    public BigDecimal calculateAnnualSalaryAdjustment (Employee employee) {
        return salaryAdjustmentCalculator.calculateAnnualAdjustment(employee);
    }

    public void setSalaryAdjustmentCalculator(SalaryAdjustmentCalculator salaryAdjustmentCalculator) {
        this.salaryAdjustmentCalculator = salaryAdjustmentCalculator;
    }
}
