import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] carParts = new String[] {"key","roll"};

        Car dacia = new Car("dacia",12,2022,"black" , carParts);
        Car toyota = new Car("null", 0, 0, null ,carParts );
        toyota.setColor("red");
        carParts[1] = "test" ; 
        System.out.println(dacia.getColor());
        toyota.setParts(carParts) ; 
        System.out.println(dacia);

        dacia.drive();
    }
}
