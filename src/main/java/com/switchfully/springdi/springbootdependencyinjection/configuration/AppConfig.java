package com.switchfully.springdi.springbootdependencyinjection.configuration;

import com.switchfully.springdi.springbootdependencyinjection.TaxCalculator;
import com.switchfully.springdi.springbootdependencyinjection.calculations.AmericanTaxCalculation;
import com.switchfully.springdi.springbootdependencyinjection.calculations.BelgianTaxCalculation;
import com.switchfully.springdi.springbootdependencyinjection.calculations.FrenchTaxCalculation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

;

@Configuration
@ComponentScan(basePackages = "com.switchfully.springdi")
public class AppConfig {
    @Bean("american")
    public TaxCalculator americanTaxes() {
        return new TaxCalculator(new AmericanTaxCalculation());
    }

    @Bean("belgian")
    @Primary
    public TaxCalculator belgianTaxes() {
        return new TaxCalculator(new BelgianTaxCalculation());
    }

    @Bean("french")
    public TaxCalculator frenchTaxes() {
        return new TaxCalculator(new FrenchTaxCalculation());
    }
}
