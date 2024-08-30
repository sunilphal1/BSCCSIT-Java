
import java.util.Scanner;

public class Command {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for name and age
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        // Display the entered details
        System.out.println("Name: " + name + ", Age: " + age);

        scanner.close();
    }
}

