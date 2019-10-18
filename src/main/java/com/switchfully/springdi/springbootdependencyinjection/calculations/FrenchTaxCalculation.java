package com.switchfully.springdi.springbootdependencyinjection.calculations;

import com.switchfully.springdi.springbootdependencyinjection.TaxCalculation;

public class FrenchTaxCalculation implements TaxCalculation {

    private static final double FR_TAX_RATE = 0.48;

    public double calculateTaxes(double yearlyIncome) {
        return yearlyIncome * FR_TAX_RATE;
    }
}

