package com.switchfully.springdi.springbootdependencyinjection.calculations;

import com.switchfully.springdi.springbootdependencyinjection.TaxCalculation;

public class BelgianTaxCalculation implements TaxCalculation {

    private static final double BE_TAX_RATE = 0.45;

    public double calculateTaxes(double yearlyIncome) {
        return yearlyIncome * BE_TAX_RATE;
    }
}
