package com.example.movidlegame;

import javafx.scene.control.Button;

public class ButtonController {
    public static void resetButton(Button button){
        button.setStyle("");
        button.setText("");
    }
    public static void backgroundToGreen(Button button){
        button.setStyle("-fx-background-color: green");
    }
    public static void backgroundToRed(Button button){
        button.setStyle("-fx-background-color: red");
    }
    public static void setTextToButton(Movie movie, Button button1, Button button2, Button button3, Button button4, Button button5, Button button6){
        button1.setText(movie.getTitle());
        button2.setText(movie.getYear());
        button3.setText(movie.getGenre());
        button4.setText(movie.getOrigin());
        button5.setText(movie.getDirector());
        button6.setText(movie.getStar());
    }
}
