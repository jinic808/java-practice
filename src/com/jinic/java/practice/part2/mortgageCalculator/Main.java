package com.jinic.java.practice.part2.mortgageCalculator;

public class Main {
    public static void main(String[] args) {
        var readUserInput = new ReadUserInput();
        int principal = (int) readUserInput.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) readUserInput.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) readUserInput.readNumber("Period (Years): ", 1, 30);

        var mortgage = new Mortgage(principal, annualInterest, years);
        mortgage.printMortgage();

        var paymentSchedule = new PaymentSchedule(principal, annualInterest, years);
        paymentSchedule.printPaymentSchedule();
    }
}
