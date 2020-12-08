package com.mortgage;

public interface LoanCalculator {
    double calculateBalance(short numberOfPaymentsMade);

    double calculateMortgage();

    double[] getRemainingBalance();
}
