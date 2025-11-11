package com.calculator.v2.CalculatorLogicPackage.CompoundInterest_Package;

import java.util.Scanner;

public class CI {
    float principal;
    float rate;
    float time;
    float compoundInterest;
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
        amount = (float) (principal * Math.pow(1 + (rate / 100), time));
        compoundInterest = amount - principal;
        System.out.println("According to question:-\nPrincipal: " + "Rs." + principal + "\nRate: " + rate + "%" + "\nTime: " + time + "years");
        System.out.println("C.I. = Rs." + compoundInterest + ".");
        System.out.println("Amount = Rs." + amount + ".");
    }

    public static void main(String[] args) {
        CI objCI = new CI();
        objCI.getInput();
        objCI.calculateAndDisplay();
    }
}
