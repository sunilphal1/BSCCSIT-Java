public class Foreach {
    public static void main(String[] args){
        int[] numbers = {6, 7, 3, 9, 5};
        int sum = 0;
        for (int number : numbers) {
            System.out.println(number);
            sum += number;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Size of array: " + numbers.length);
    }
}

