package com.switchfully.springdi.springbootdependencyinjection;

public class TaxCalculator {

    private TaxCalculation taxCalculation;


    public TaxCalculator(TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }

    public double calculateTaxesWith(double yearlyIncome) {
        return taxCalculation.calculateTaxes(yearlyIncome);
    }
}

