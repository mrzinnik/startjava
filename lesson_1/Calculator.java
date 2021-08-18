public class Calculator {
    
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 2;
        char mathOperator = '^';
        int result = 0;

        if(mathOperator == '+') {
            result = num1 + num2;
        }

        if(mathOperator == '-') {
            result = num1 - num2;
        }

        if(mathOperator == '*') {
            result = num1 * num2;    
        }

        if(mathOperator == '/') {
            result = num1 / num2;
        }

        if(mathOperator == '%') {
            result = num1 % num2;
        }

        if(mathOperator == '^') {
            result = num1;
            for(int i = 2; i <= num2; i++) {
                result *= num1;
            }
        }

        System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + result);
    }
}