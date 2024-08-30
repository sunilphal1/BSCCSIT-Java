import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the first number
        System.out.print("Enter the first number: ");
        // Read the first number
        double num1 = scanner.nextDouble();
        
        // Prompt the user for the second number
        System.out.print("Enter the second number: ");
        // Read the second number
        double num2 = scanner.nextDouble();
        
        // Add the two numbers
        double sum = num1 + num2;
         // Add the subtract numbers
         double diff = num1 - num2;
        // Add the divide numbers
        double div = num1 / num2;
        // Add the multiply numbers
        double mul = num1 * num2;
        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        System.out.println("The diff of " + num1 + " and " + num2 + " is " + diff);
        System.out.println("The div of " + num1 + " and " + num2 + " is " + div);
        System.out.println("The mul of " + num1 + " and " + num2 + " is " + mul);10
        // Close the scanner
        scanner.close();
    }
}