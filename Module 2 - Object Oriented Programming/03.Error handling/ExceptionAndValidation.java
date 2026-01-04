import java.util.Scanner;

public class ExceptionAndValidation {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int age = scan.nextInt();

            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }

            System.out.println("Age is: " + age);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


}
