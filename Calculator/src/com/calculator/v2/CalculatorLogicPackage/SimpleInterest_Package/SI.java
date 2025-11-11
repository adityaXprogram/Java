package com.calculator.v2.CalculatorLogicPackage.SimpleInterest_Package;

import java.util.Scanner;

public class SI {
    float principal;
    float rate;
    float time;
    float simpleInterest;
    float amount;

    // Method to get input from user
    public void getInput() {
        Scanner le = new Scanner(System.in);
        System.out.print("Enter the Principal (in rupees): ");
        principal = le.nextFloat();
        System.out.print("Enter your rate: ");
        rate = le.nextFloat();
        System.out.print("Enter the Time (in years): ");
        time = le.nextFloat();
    }

    public void calculateAndDisplay() {
        simpleInterest = (principal * rate * time) / 100;
        amount = principal + simpleInterest;
        System.out.println("According to question:-\nPrincipal: " + "Rs." + principal + "\nRate: " + rate + "%" + "\nTime: " + time + "years");
        System.out.println("S.I. = Rs." + simpleInterest + ".");
        System.out.println("Amount = Rs." + amount + ".");
    }

    public static void main(String[] args) {
        SI objSI = new SI();
        objSI.getInput();
        objSI.calculateAndDisplay();
    }
}
