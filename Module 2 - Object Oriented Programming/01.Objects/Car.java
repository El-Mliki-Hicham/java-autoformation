import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts ;

    public Car(String make, double price, int year, String color,String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts , parts.length);
    }

    public String getMake(){return this.make;}
    public double getPrice(){return this.price;}
    public int getYear(){return this.year;}
    public String getColor(){return this.color;}
    public String[] getParts(){return Arrays.copyOf(parts , parts.length);;}
    
    public String setMake(String make){return this.make = make ;}
    public double setPrice(double price){return this.price = price ;}
    public int setYear(int year){return this.year = year ;}
    public String setColor(String color){return this.color = color ;}
    public String[] setParts(String[] parts){return this.parts = Arrays.copyOf(parts , parts.length) ;}


    public void drive(){
    System.out.println("your car is " +this.make );
    }

    @Override
    public  String toString(){
         return "Make: " + this.make + ".\n" 
            +  "Price: " + this.price + ".\n"
            +  "Year: " + this.year + ".\n"
            +  "Color: " + this.color + ".\n"
            +  "Parts: " + Arrays.toString(parts) + ".\n";

    }

}
