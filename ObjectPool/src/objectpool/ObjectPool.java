/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectpool;

/**
 *
 * @author josemiguelvargas
 */
public class ObjectPool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MoviesPool movies = new MoviesPool(3);
        Movie movie = movies.getMovie();
        Movie movie2 = movies.getMovie();
        System.out.println(movie.getName());
        movies.putMovie(movie);
        Movie movie3 = movies.getMovie();
        System.out.println(movie3.getName());
    }
    
}
