package com.calculator.v2.CalculatorLogicPackage.Multiplication_Package;
import java.util.Scanner;

public class multiplication {
    public void multiplyFun() {
        Scanner jk = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        float fNumMul_a = jk.nextFloat();
        System.out.print("Enter your second number: ");
        float sNumMul_b = jk.nextFloat();
        float result = fNumMul_a * sNumMul_b;
        System.out.print(fNumMul_a + " * " + sNumMul_b + " = " + result);
    }

    public static void main(String[] args) {
        multiplication objMul = new multiplication();
        objMul.multiplyFun();
    }
}