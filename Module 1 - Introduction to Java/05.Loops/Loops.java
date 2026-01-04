public class Loops {
            public static void main(String[] args) {
            
                for(int i = 0 ; i <= 0 ; i++){
                    System.out.println(i);
                }

                for(int i =1 ; i <= 5 ; i++){
                    helloMessage();
                }
                
                for(int i =1 ; i <= 5 ; i++){
                    multiplicationSystem(i);
                }
                
                for(int i =10 ; i >= 0 ; i--){
                     System.out.println(i);
                }
            }

            public static void helloMessage() {
                    System.out.println("Hello world");
            }

            public static void multiplicationSystem(int number) {
                    System.out.println(5 * number);
            }

}