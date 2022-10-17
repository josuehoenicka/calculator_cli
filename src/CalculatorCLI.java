package calculatorcli;

import java.util.Scanner;

public class CalculatorCLI {

    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;
        
        try ( 
            // create an object of Scanner class
            Scanner input = new Scanner(System.in)){
            
                // Enter operator
                System.out.println("Choose an operator: +, -, *, or /");
                operator = input.next().charAt(0);

                // Enter first number
                System.out.println("Enter first number");
                number1 = input.nextDouble();

                // Enter second number
                System.out.println("Enter second number");
                number2 = input.nextDouble();
                
                // Result
                switch (operator) {
                    case '+' -> {
                        result = number1 + number2;
                        System.out.println(number1 + " + " + number2 + " = " + result);
                    }
                    case '-' -> {
                        result = number1 - number2;
                        System.out.println(number1 + " - " + number2 + " = " + result);
                    }
                    case '*' -> {
                        result = number1 * number2;
                        System.out.println(number1 + " * " + number2 + " = " + result);
                    }
                    case '/' -> {
                        result = number1 / number2;
                        System.out.println(number1 + " / " + number2 + " = " + result);
                    }

                    default -> System.out.println("Invalid operator!");
                }
            }
    }
    
}
