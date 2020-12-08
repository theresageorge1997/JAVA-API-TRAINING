package com.company;

public class TaxCalculator {

    private  double taxableIncome;

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public TaxCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double calculateTax(){
        return taxableIncome * 0.3;
    }
}
