package com.calculator.v2.CalculatorLogicPackage.Division_Package;
import java.util.Scanner;

public class division {
    public void divFun() {
        Scanner jl = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        float fNumDiv_a = jl.nextFloat();
        System.out.print("Enter your second number: ");
        float sNumDiv_b = jl.nextFloat();
        
        if(sNumDiv_b != 0){
        float result = fNumDiv_a / sNumDiv_b;
        System.out.print(fNumDiv_a + " / " + sNumDiv_b + " = " + result);
        }
        else{
            System.out.println("If you divide a number with zero, answer will be infinity.");
        }
    }

    public static void main(String[] args) {
        division objDiv = new division();
        objDiv.divFun();
    }
}
