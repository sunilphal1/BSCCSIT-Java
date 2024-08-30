public class Operation {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        int difference = num1 - num2;
        System.out.println("Difference of " + num1 + " and " + num2 + " is: " + difference);
        int product = num1 * num2;
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);
        double quotient = (double) num1 / num2;
        System.out.println("Quotient of " + num1 + " and " + num2 + " is: " + quotient);
        int remainder = num1 % num2;
        System.out.println("Remainder of " + num1 + " and " + num2 + " is: " + remainder);
    }
}

