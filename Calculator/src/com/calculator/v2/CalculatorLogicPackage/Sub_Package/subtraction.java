package com.calculator.v2.CalculatorLogicPackage.Sub_Package;
import java.util.Scanner;

public class subtraction {
    public void subFun() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        float fNumSub_a = sc.nextFloat();
        System.out.print("Enter your second number: ");
        float sNumSub_b = sc.nextFloat();
        float result = fNumSub_a - sNumSub_b;
        System.out.print(fNumSub_a + " - " + sNumSub_b + " = " + result);
    }

    public static void main(String[] args) {
        subtraction objSub = new subtraction();
        objSub.subFun();
    }
}