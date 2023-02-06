package com.bobini.java.practice;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorOne {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEARS = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Annual Interest Rate: ");
        float monthlyRate = scanner.nextFloat() / PERCENT / MONTHS_IN_YEARS;

        System.out.print("Period (Years): ");
        float period = scanner.nextFloat() * MONTHS_IN_YEARS;

        float pow = (float)Math.pow(1 + monthlyRate, period);
        double mortgage = (principal * monthlyRate * pow) / (pow - 1);
        System.out.print("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
