package com.switchfully.springdi.springbootdependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDependencyInjectionApplication implements CommandLineRunner {

    private ApplicationContext applicationContext;

    @Autowired
    public SpringBootDependencyInjectionApplication(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDependencyInjectionApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        TaxCalculator americanCalculator = applicationContext.getBean("american", TaxCalculator.class);
        TaxCalculator belgianCalculator = applicationContext.getBean("belgian", TaxCalculator.class);
        TaxCalculator frenchCalculator = applicationContext.getBean("french", TaxCalculator.class);

        System.out.println(americanCalculator.calculateTaxesWith(23000));
        System.out.println(belgianCalculator.calculateTaxesWith(23000));
        System.out.println(frenchCalculator.calculateTaxesWith(23000));

    }
}
