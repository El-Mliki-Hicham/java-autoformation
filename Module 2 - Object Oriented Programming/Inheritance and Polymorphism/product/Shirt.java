package product;

public class Shirt extends Product {

   
    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}


    public Shirt(Size size,int price,String color ,String brand){
        super(price, color, brand);
        this.size = size ;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }


}
