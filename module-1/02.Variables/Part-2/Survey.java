import java.util.Scanner;

public class Survey {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer counter = 0 ;
        System.out.println("Hello , What is you name ?");
        String userName = scanner.nextLine();
        counter ++;
        System.out.println("How old are you ?");
        String age = scanner.nextLine();
        counter ++;
        System.out.println("How much cost your t-chirt ?");
        Integer tChirtPrice = scanner.nextInt();
        counter ++;

        scanner.close();

        System.out.println("Thank you Mr "+userName +" for all the " + counter + " Qestions." );
        System.out.println("Your age is " + age );
        System.out.println("Your t-chirt price is  " + tChirtPrice + "DH" );
        
    }
}