package com.example.movidlegame;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.util.Duration;

public  class AnimationController {


    public static void hboxAnimator(HBox hbox){
        //hbox.setOpacity(0);
        //Timeline timeline=new Timeline(new KeyFrame((Duration.seconds(1)), new KeyValue(hbox.opacityProperty(), 1)));
        //timeline.play();
        FadeTransition ft = new FadeTransition ( Duration . millis (1000) , hbox );
        ft . setFromValue (0.1);
        ft . setToValue (1.0);
        ft . setCycleCount ( 1 );
        ft . setAutoReverse ( false );
        ft . play ();


    }


}
