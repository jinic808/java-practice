package com.jinic.java.practice.part2.mortgageCalculator;

import java.text.NumberFormat;

public class PaymentSchedule {
    private int principal;
    private float annualInterest;
    private byte years;

    public PaymentSchedule(int principal, float annualInterest, byte years) {
        this.setPrincipal(principal);
        this.setAnnualInterest(annualInterest);
        this.setYears(years);
    }

    public void setPrincipal(int principal) {
        this.principal = principal;
    }

    public void setAnnualInterest(float annualInterest) {
        this.annualInterest = annualInterest;
    }

    public void setYears(byte years) {
        this.years = years;
    }

    public void printPaymentSchedule() {
        var balance = new Balance();
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        byte MONTHS_IN_YEAR = 12;
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double currentBalance = balance.calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(currentBalance));
        }
    }
}
