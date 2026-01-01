public class IfAndElseStatments {
         public static void main(String[] args) {
            int points = 60 ; 
            int validationPoints = 50 ; 

            if(points <= validationPoints){
                System.out.println("No Valide");
            }else{

                System.out.println("Valide");
            }
            
            if(points >= validationPoints){
                System.out.println("Valide");
            }

            switch (points) {
                case 12 : System.out.println("validate 12 from switch");
                break;
                case 30: System.out.println("validate 30 from switch");
                break;
                case 60: System.out.println("validate  60 from switch");
                break;
                case 70: System.out.println("validate  70 from switch");
                    
                    break;
            
                default: System.out.println("default value");
                    break;
            }

         }
        }
