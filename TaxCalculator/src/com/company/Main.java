package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Income:");
        double income = sc.nextDouble();

        TaxCalculator calculator = new TaxCalculator(income);
        calculator.setTaxableIncome(income);

        TaxReport report =new TaxReport();
        report.show(calculator.calculateTax());
    }
}
