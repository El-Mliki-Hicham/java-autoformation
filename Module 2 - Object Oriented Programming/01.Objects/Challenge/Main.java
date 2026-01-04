package Challenge;

import java.util.Scanner;

public class Main {

    static Store store = new Store();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Movie movie1 = new Movie("The Shawshank Redemption", "BlueRay", 9.2);
        Movie movie2 = new Movie("The Godfather", "BlueRay", 9.1);
        Movie movie3 = new Movie("The Godfather: Part II", "DVD", 9.0);
        Movie movie4 = new Movie("The Dark Knight", "BlueRay", 9.0);
        Movie movie5 = new Movie("Schindler's List", "DVD", 8.9);
        Movie movie6 = new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9);
        Movie movie7 = new Movie("Pulp Fiction", "DVD", 8.8);
        Movie movie8 = new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8);

        // System.out.println("******************************MOVIE
        // STORE*****************************");
        // System.out.println(movie1);
        // System.out.println(movie2);
        // System.out.println(movie3);
        // System.out.println(movie4);
        // System.out.println(movie5);
        // System.out.println(movie6);
        // System.out.println(movie7);
        // System.out.println(movie8);

        Store movieStore = new Store();
        movieStore.setMovie(0, movie1);
        movieStore.setMovie(1, movie2);
        movieStore.setMovie(2, movie3);
        movieStore.setMovie(3, movie4);
        movieStore.setMovie(4, movie5);
        movieStore.setMovie(5, movie6);
        movieStore.setMovie(6, movie7);
        movieStore.setMovie(7, movie8);

        Movie[] movies = movieStore.getAllMovies();
        // edit
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i]);
            System.out.println(
                    "press number for edit rating for this movie or  \"To edit another rating, type: 'continue' : ");
            String confirm = scanner.nextLine();
            if (confirm.equals("continue")) {
                continue;
            } else {
                double rating = Double.parseDouble(confirm);
                movies[i].setRating(rating);
                movieStore.setMovie(i, movies[i]);
                System.out.println("your movie has been updated");
                System.out.println("if you want to stop press stop :");
                String stop = scanner.nextLine();
                if(stop.equals("stop")){
                      System.out.println("****************************** New MOVIE lists*****************************");
                       for (int f = 0; f < movies.length; f++) {
                       System.out.println(movies[f]);
                      }
                      break;
                 }
        }

    }
}
}
