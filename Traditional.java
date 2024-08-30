public class Traditional {
    public static void main(String[] args){
         int[] numbers= {1,2,3,4,5,6,7,8};
         int sum = 0;
         int i;
         for (i=0; i<numbers.length; i++){
             System.out.println(numbers[i]);
             sum += numbers[i];
         }
         System.out.println("Sum: " + sum);
    }
}
