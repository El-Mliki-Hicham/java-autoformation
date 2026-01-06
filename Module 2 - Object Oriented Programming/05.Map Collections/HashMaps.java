import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMaps {
    public static void main(String[] args) {
     Map<String , Integer>  inveontry = new HashMap<>() ;

     inveontry.put("apples", 30);
     inveontry.put("bannanas", 20);
     inveontry.put("ananas", 3);
    
     System.out.println(inveontry.get("bannanas"));
    
    
    }


}
