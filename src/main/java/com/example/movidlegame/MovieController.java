package com.example.movidlegame;

public class MovieController {
    public Movie selectedMovie;
    public Movie foundMovie;
    public String guessMovie;
    public Movie selectMovie(){
        return selectedMovie=FileController.randomGetMovie();
    }
    public Movie getGuessMovie(String  movie){
        guessMovie=movie;
        for (Movie film:FileController.listMovie){
            if (film.getTitle().equalsIgnoreCase(guessMovie)){
                foundMovie =film;
                break;
            }
        }
        return foundMovie;

    }
    boolean validateMovie(String movie) {
        for (var film:FileController.listMovie){
            if (movie.equalsIgnoreCase(film.getTitle())){
                return true;
            }
        }
        return false;
    }
}
