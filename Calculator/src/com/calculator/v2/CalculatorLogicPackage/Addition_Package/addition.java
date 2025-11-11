package com.calculator.v2.CalculatorLogicPackage.Addition_Package;
import java.util.Scanner;
public class addition {
    public void addFun(){
        Scanner jk = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        float fNumAdd_a = jk.nextFloat();
        System.out.print("Enter your second number: ");
        float sNumAdd_b = jk.nextFloat();
        float result = fNumAdd_a + sNumAdd_b;
        System.out.print(fNumAdd_a + " + " + sNumAdd_b + " = " + result);
    }    
    public static void main(String[] args) {
        addition objAdd = new addition();
        objAdd.addFun();
    }
}
