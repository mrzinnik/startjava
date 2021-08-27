package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    String[] mathExpression;

    public Calculator(String[] mathExpression) {
        this.mathExpression = mathExpression;
    }

    public int calculate() {
        int num1 = Integer.parseInt(mathExpression[0]);
        int num2 = Integer.parseInt(mathExpression[2]);

        switch(mathExpression[1]) {
            case "+":
                return Math.addExact(num1, num2);
            case "-":
                return Math.subtractExact(num1, num2);
            case "*":
                return Math.multiplyExact(num1, num2);
            case "/":
                return Math.floorDiv(num1, num2);
            case "%":
                return Math.floorMod(num1, num2);
            case "^":
                return (int) Math.pow(num1, num2);
            default:
                return 0;
        }
    }
}