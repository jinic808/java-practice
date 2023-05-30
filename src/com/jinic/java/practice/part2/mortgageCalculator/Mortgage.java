package com.jinic.java.practice.part2.mortgageCalculator;

import java.text.NumberFormat;

public class Mortgage {
    private int principal;
    private float annualInterest;
    private byte years;

    public Mortgage(int principal, float annualInterest, byte years) {
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

    public double calculateMortgage() {
        byte PERCENT = 100;
        byte MONTHS_IN_YEAR = 12;
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    public void printMortgage() {
        double mortgage = calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}
