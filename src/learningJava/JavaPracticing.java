package learningJava;

import java.math.BigDecimal;
import java.util.Scanner;

public class JavaPracticing {
    
    public static void main(String[] args) {
        
        try ( 
            // creates an object of Scanner
            Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = input.nextLine();
            System.out.println("Welcome " + name);
            System.out.print("Enter your age: ");
            BigDecimal value = input.nextBigDecimal();
            System.out.println(name + "'s age is " + value); 
            System.out.print("\nHave a nice day " + name + "!\n\n\n"); 
        }
        
    }
}
