package com.calculator.v2.CalculatorLogicPackage.Cube_Package;
import java.util.Scanner;

public class cube {
    public void CubeFun() {
        Scanner ld = new Scanner(System.in);
        System.out.print("Enter your number: ");
        float fNumCu_a = ld.nextFloat();
        float result = fNumCu_a * fNumCu_a * fNumCu_a;
        System.out.print("Square of "+fNumCu_a+" is "+result);
    }
    public static void main(String[] args) {
        cube objSq = new cube();
        objSq.CubeFun();
    }
}
