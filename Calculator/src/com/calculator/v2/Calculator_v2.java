package com.calculator.v2;

// importing important packages
import java.util.Scanner;
import com.calculator.v2.CalculatorLogicPackage.Addition_Package.addition;
import com.calculator.v2.CalculatorLogicPackage.CompoundInterest_Package.CI;
import com.calculator.v2.CalculatorLogicPackage.CubeRoot_Package.CuRoot;
import com.calculator.v2.CalculatorLogicPackage.Division_Package.division;
import com.calculator.v2.CalculatorLogicPackage.Multiplication_Package.multiplication;
import com.calculator.v2.CalculatorLogicPackage.SimpleInterest_Package.SI;
import com.calculator.v2.CalculatorLogicPackage.Square_Package.square;
import com.calculator.v2.CalculatorLogicPackage.Sub_Package.subtraction;
import com.calculator.v2.CalculatorLogicPackage.Cube_Package.cube;
import com.calculator.v2.CalculatorLogicPackage.SquareRoot_Package.SqRoot;
// importing ends here

class Calculator_v2{
    Scanner jp = new Scanner(System.in);
    int choice;
    void UserChoice(){
        System.out.println("To choose a calculation, enter the number shown before it. For example: 1 for Addition, 2 for Subtraction");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square");
        System.out.println("6. Cube");
        System.out.println("7. Square Root");
        System.out.println("8. Cube Root");
        System.out.println("9. Simple Interest (S.I.)");
        System.out.println("10. Compound Interest (C.I.)");
        System.out.print("Enter your choice: ");
        choice = jp.nextInt();
    }

    void Calculator_v2_Logic(){
        switch (choice) {
            case 1 -> {
                addition objAdd = new addition();
                objAdd.addFun();
            }
            case 2 -> {
                subtraction objSub = new subtraction();
                objSub.subFun();
            }
            case 3 -> {
                multiplication objMul = new multiplication();
                objMul.multiplyFun();
            }
            case 4 -> {
                division objDiv = new division();
                objDiv.divFun();
            }
            case 5 -> {
                square objSq = new square();
                objSq.SquareFun();
            }
            case 6 -> {
                cube objSq = new cube();
                objSq.CubeFun();
            }
            case 7 -> {
                SqRoot objSq = new SqRoot();
                objSq.SqRootFun();
            }
            case 8 -> {
                CuRoot objSq = new CuRoot();
                objSq.CuRootFun();
            }
            case 9 -> {
                SI objSI = new SI();
                objSI.getInput();
                objSI.calculateAndDisplay();
            }
            case 10 -> {
                CI objCI = new CI();
                objCI.getInput();
                objCI.calculateAndDisplay();
            }
            default -> System.out.println("Invalid choice!");
        }
    }
    public static void main(String[] args) {
        Calculator_v2 mr_calcu = new Calculator_v2();
        mr_calcu.UserChoice();
        mr_calcu.Calculator_v2_Logic();
    }
}