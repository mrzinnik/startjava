package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] mathExpression;
        String continueAnswer;

        do {
            System.out.print("Enter math expression: ");
            mathExpression = scanner.nextLine().split(" ");
            Calculator calc = new Calculator(mathExpression);
            System.out.println("Result: " + calc.calculate());
            
            do {
                System.out.print("Do you want to continue? [yes/no]: ");
                continueAnswer = scanner.nextLine();
            } while (!(continueAnswer.equals("yes") || continueAnswer.equals("no")));
        } while(continueAnswer.equals("yes"));  
    }
}