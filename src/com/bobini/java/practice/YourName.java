package com.bobini.java.practice;

import java.util.Scanner;

public class YourName {
    public static void main(String[] args) {
        System.out.println("hi i'm bobini, what's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("nice to meet you " + name + " :)");
    }
}
