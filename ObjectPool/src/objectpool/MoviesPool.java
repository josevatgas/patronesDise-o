/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectpool;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josemiguelvargas
 */
public class MoviesPool {
    
    private int numInstances;
    private List <Movie> movies;

    public MoviesPool(int numInstances) {
        this.movies = new ArrayList<>();
        this.numInstances = numInstances;
        
        for (int i =1; i<=this.numInstances; i++){
            Movie movie = new  Movie("movie "+i);
            this.movies.add(movie);    
        }
        
    }
    
    public Movie getMovie(){
        if(this.movies.isEmpty()){
            return null;
        }
        Movie movie = this.movies.get(0);
        this.movies.remove(0);
        return movie;
    }
    
    public void putMovie(Movie movie){
        this.movies.add(movie);
    }
}
