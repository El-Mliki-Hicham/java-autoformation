import java.util.Arrays;

public class ArraysAndTrapRef {

    public static void main(String[] args) {
    //   intArrayExemple();
    // stringArrayExemple();
        twoDArray();
    
}

        public static void intArrayExemple(){
              int[] listIds = {1,2,5,7};

        
        for(int i = 0 ; i<= listIds.length - 1; i++ ){

            if(listIds[i]  == 5){
                listIds[i] = 15 ;
            }
        }

        for (int id : listIds) {
            System.out.println("id: " + id);
        }

        char[] array = { 'q', 'u', 'i', 'z', '6', '2'};
        
        System.out.println( array[array.length-1] );


        }

        public static void stringArrayExemple(){

            String[] staffThisYear = {"amine" , "karim" , "kawtar"};
            String[] staffNewYear = new String[3] ; 

            for (int i = 0; i < staffThisYear.length; i++) {
                        staffNewYear[i] = staffThisYear[i] ;
            }

            staffNewYear[2] = "samir" ; 
            System.out.println(Arrays.toString(staffThisYear));
            System.out.println(Arrays.toString(staffNewYear));

        }

        public static void twoDArray(){

            int[][] priceList = new int[3][4];
                priceList[1][0] = 24 ; 
                priceList[0][3] = 22 ; 
            System.out.println(Arrays.toString(priceList[0]));
            System.out.println(Arrays.toString(priceList[1]));
            System.out.println(Arrays.toString(priceList[2]));
        }

    }
