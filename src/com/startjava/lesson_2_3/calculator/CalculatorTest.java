package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        String continueAnswer;
        
        do {
            System.out.print("Введите первое число: ");
            calc.setNum1(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Введите знак математической операции: ");
            calc.setMathOperator(scanner.next().charAt(0));
            scanner.nextLine();
            System.out.print("Введите второе число: ");
            calc.setNum2(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Результат: " + calc.calculate());
            
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                continueAnswer = scanner.nextLine();
            } while (!(continueAnswer.equals("yes") || continueAnswer.equals("no")));
        } while(continueAnswer.equals("yes"));  
    }
}