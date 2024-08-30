public class Line {
    public static void main(String[] args){
        if (args.length < 2){
            System.out.println("Please enter your name and age: ");
        }
        String name = args[0];
        String age = args[1];
        System.out.println("Hi " + name + "! You are "+ age + " years old");
    }
}

