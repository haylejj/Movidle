package com.example.movidlegame;

import javafx.scene.control.Button;

public class CompareController {

    public static void compareMovie(Movie selectedMovie, Movie foundMovie, Button button1,Button button2,Button button3,Button button4,Button button5,Button button6){
        if (selectedMovie.getTitle().equals(foundMovie.getTitle())){
            ButtonController.backgroundToGreen(button1);
        }
        else{
            ButtonController.backgroundToRed(button1);
        }
        if (selectedMovie.getYear().equals(foundMovie.getYear())){
            ButtonController.backgroundToGreen(button2);
        }
        else {
            ButtonController.backgroundToRed(button2);
        }
        if (selectedMovie.getGenre().equals(foundMovie.getGenre())){
            ButtonController.backgroundToGreen(button3);
        }
        else {
            ButtonController.backgroundToRed(button3);
        }
        if (selectedMovie.getOrigin().equals(foundMovie.getOrigin())){
            ButtonController.backgroundToGreen(button4);
        }
        else{
            ButtonController.backgroundToRed(button4);
        }
        if (selectedMovie.getDirector().equals(foundMovie.getDirector())){
            ButtonController.backgroundToGreen(button5);
        }
        else {
            ButtonController.backgroundToRed(button5);
        }
        if (selectedMovie.getStar().equals(foundMovie.getStar())){
            ButtonController.backgroundToGreen(button6);
        }
        else {
            ButtonController.backgroundToRed(button6);
        }
    }
}
