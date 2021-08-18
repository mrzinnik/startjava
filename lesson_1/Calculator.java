public class Calculator {
    
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 9;
        char mathOperator = '^';
        int result = 0;

        if(mathOperator == '+') {
            result = num1 + num2;
        } else if(mathOperator == '-') {
            result = num1 - num2;
        } else if(mathOperator == '*') {
            result = num1 * num2;    
        } else if(mathOperator == '/') {
            result = num1 / num2;
        } else if(mathOperator == '%') {
            result = num1 % num2;
        } else if(mathOperator == '^') {
            result = 1;
            for(int i = 1; i <= num2; i++) {
                result *= num1;
            }
        }

        System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + result);
    }
}