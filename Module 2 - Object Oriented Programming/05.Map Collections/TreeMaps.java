import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
     Map<String , Integer>  inventory = new TreeMap<>() ;

     inventory.put("apples", 30);
     inventory.put("bannanas", 20);
     inventory.put("ananas", 3);
    
     System.out.println(inventory.get("bannanas"));
    
    
    }


}
