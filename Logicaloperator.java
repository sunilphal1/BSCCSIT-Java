public class Logicaloperator {
    public static void main(String[] args) {
        int x = 40;
        int y = 70;
        // Logical AND (&&) operator
        if (x > 0 && y > 0) {
            System.out.println("Both x and y are positive numbers.");
        } else {
            System.out.println("At least one of x and y is not a positive number");
        }
        // Logical OR (||) operator
        if (x > 0 || y > 0) {
            System.out.println("At least one of x or y is a positive number");
        } else {
            System.out.println("Neither x nor y is a positive number");
        }
        // Logical NOT (!) operator
        if (!(x > 0)) {
            System.out.println("x is not a positive number");
        } else {
            System.out.println("x is a positive number.");
        }
        // Loop with logical AND (&&) inside
        for (int i = 0; i < 3; i++) {
            if (x < y && y - x == 5) {
                System.out.println("In iteration " + i + ": y is greater than x by 5.");
            } else {
                System.out.println("In iteration " + i + ": The condition is not met.");
            }
        }
    }
}

