public class Minimum {
    public static void main(String[] args){
        int[] numbers = {5,23,12,88, 45, 11};
        int minimum = numbers[0];
        for(int i=0;i<numbers.length; i++){
            if (numbers[i]<minimum){
                minimum=numbers[i];
                i++;
            }
        }   
        System.out.println(minimum);

    }
}
