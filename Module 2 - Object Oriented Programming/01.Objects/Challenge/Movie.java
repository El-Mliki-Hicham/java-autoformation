package Challenge;

public class Movie {
    private String name ; 
    private String format ; 
    private Double rating ; 



    public Movie(String  name , String format , Double rating ){
        this.name = name ; 
        this.format = format ; 
        this.rating = rating ; 
    }

     public String setName(String name){
        return name = this.name ; 
     }
     public String setFormat(String format){
        return format = this.format ; 
     }
     public Double setRating(Double rating){
        return rating = this.rating ; 
     }

     public String getName(){
        return this.name ; 
     }
     public String getFormat(){
        return this.format ; 
     }
     public Double getRating(){
        return this.rating ; 
     }

     @Override
     public String toString(){
        return  this.rating + "   " +this.format+ "         " + this.name;
     }




}



