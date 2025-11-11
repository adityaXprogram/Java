package com.calculator.v2.CalculatorLogicPackage.Square_Package;
import java.util.Scanner;

public class square {
    public void SquareFun() {
        Scanner lk = new Scanner(System.in);
        System.out.print("Enter your number: ");
        float fNumSq_a = lk.nextFloat();
        float result = fNumSq_a * fNumSq_a;
        System.out.print("Square of "+fNumSq_a+" is "+result);
    }
    public static void main(String[] args) {
        square objSq = new square();
        objSq.SquareFun();
    }
}
