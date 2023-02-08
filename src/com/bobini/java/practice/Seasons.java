package com.bobini.java.practice;

public class Seasons {
    public static void main(String[] args) {
        int currentMonth = 12;
        switch (currentMonth) {
            case 2:
            case 3:
            case 4:
                System.out.println("it's spring");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("it's summer");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("it's fall");
                break;
            case 11:
            case 12:
            case 1:
                System.out.println("it's winter");
                break;
            default:
                System.out.println("out of range. please enter a whole number between 1 - 12");
        }
    }
}
