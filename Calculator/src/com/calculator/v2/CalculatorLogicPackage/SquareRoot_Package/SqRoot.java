package com.calculator.v2.CalculatorLogicPackage.SquareRoot_Package;
import java.util.Scanner;

public class SqRoot {
    public void SqRootFun() {
        Scanner li = new Scanner(System.in);
        System.out.print("Enter your number: ");
        float fNumSqr_a = li.nextFloat();
        double result = Math.sqrt(fNumSqr_a);
        System.out.print("Square root of "+fNumSqr_a+" is "+result);
    }
    public static void main(String[] args) {
        SqRoot objSq = new SqRoot();
        objSq.SqRootFun();
    }
}
