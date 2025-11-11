package com.calculator.v2.CalculatorLogicPackage.CubeRoot_Package;
import java.util.Scanner;

public class CuRoot {
    public void CuRootFun() {
        Scanner lq = new Scanner(System.in);
        System.out.print("Enter your number: ");
        float fNumCur_a = lq.nextFloat();
        double result = Math.cbrt(fNumCur_a);
        System.out.print("Square root of "+fNumCur_a+" is "+result);
    }
    public static void main(String[] args) {
        CuRoot objSq = new CuRoot();
        objSq.CuRootFun();
    }
}
