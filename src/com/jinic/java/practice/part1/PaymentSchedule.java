package com.jinic.java.practice;

import java.text.NumberFormat;

import static com.jinic.java.practice.MortgageCalculator.calculateMortgage;
import static com.jinic.java.practice.MortgageCalculator.readInput;

public class PaymentSchedule {
    public static void main(String[] args) {
        final byte PERCENT = 100;
        final byte MONTHS_OF_A_YEAR = 12;

        int paymentCount = 1;
        int principal = (int)readInput("Principal", 1000, 1_000_000);
        float annualInterest = (float)readInput("Annual interest rate", 0, 30);
        float monthlyInterest = annualInterest / PERCENT / MONTHS_OF_A_YEAR;
        float years = (float)readInput("Period", 1, 30);
        float period = years * MONTHS_OF_A_YEAR;

        double mortgage = calculateMortgage(principal, annualInterest, years);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly payments: " + NumberFormat.getCurrencyInstance().format(mortgage));

        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        while (paymentCount <= period) {
            balanceCalculator(principal, monthlyInterest, period, paymentCount);
            paymentCount += 1;
        }
    }

    public static void balanceCalculator(int principal, float monthlyInterest, float period, double paymentCount) {
        double balance = principal
                * (Math.pow(1 + monthlyInterest, period) - Math.pow(1 + monthlyInterest, paymentCount))
                / (Math.pow(1 + monthlyInterest, period) - 1);
        System.out.println(NumberFormat.getCurrencyInstance().format(balance));
    }
}
