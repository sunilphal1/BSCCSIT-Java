import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        try {
            // Open the file in read/write mode
            RandomAccessFile file = new RandomAccessFile("example.txt", "rw");

            // Write some data to the file
            file.writeUTF("Hello, World!");
            file.writeInt(42);
            file.writeDouble(3.14159);

            // Move the file pointer to the beginning
            file.seek(0);

            // Read the data back
            String message = file.readUTF();
            int number = file.readInt();
            double pi = file.readDouble();

            System.out.println("Message: " + message);
            System.out.println("Number: " + number);
            System.out.println("PI: " + pi);

            // Close the file
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
