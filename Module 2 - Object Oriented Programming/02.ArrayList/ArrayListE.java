import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListE {
    
    public static void main(String[] args) {
        List<Integer> listIds = new ArrayList<>();
        listIds.add(12);
        listIds.add(40);
        listIds.add(20);

        listIds.remove(1);
        System.out.println(listIds.get(2));

    }
}
