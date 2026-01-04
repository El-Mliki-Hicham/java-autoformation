import java.util.Random;

public class Exercice {
    public static void main(String[] args) {
            diceSystem(diceNumber(),diceChar());
    }
    
    public static int diceNumber() {
        int randomNumber = (int)( Math.random() * 4) +1;
        return randomNumber;
    }
    public static String diceChar() {
        Random random = new Random();
            char randomChar  = (char) ('a' + random.nextInt(4 ) ) ;
            String randomString =  String.valueOf(randomChar);
        
        return randomString;
    }

    public static  void diceSystem(int number , String character){

        System.out.println("________");
        System.out.println("|"+number + "    "+ character+ "|" );



    }


}
