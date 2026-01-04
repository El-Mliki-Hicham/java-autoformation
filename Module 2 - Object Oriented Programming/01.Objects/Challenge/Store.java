package Challenge;

import java.util.Arrays;

public class Store {
    
    Movie[] movies ;


    public Store(){
        this.movies = new Movie[10];
    }

    public Movie getMovie(int index){
        Movie getMovieByIndex =  this.movies[index] ; 
        return  new Movie(getMovieByIndex.getName(),getMovieByIndex.getFormat(),getMovieByIndex.getRating());

    }

    public Movie[] getAllMovies(){
        Movie[] getMovies = Arrays.copyOf(this.movies,this.movies.length )  ; 
        return  getMovies ;

    }



    public void setMovie(int index , Movie movie){

        this.movies[index]   = movie  ;

    }

}
