package com.example.movidlegame;

import javafx.scene.control.Alert;

public class AlertController {
    public static void wonAlert(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("KAZANDINIZ");
        alert.setHeaderText(UIController.getCounterRight()+1 + ".Denemede Filmi Buldunuz!!! TEBRİKLER!! ");
        alert.showAndWait();
    }
    public static  void rightAlert(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("HAKKINIZ BİTTİ");
        alert.setHeaderText("DENEME HAKKINIZ BİTTİ BAŞARAMADINIZ!!! ");
        alert.showAndWait();
    }
}
