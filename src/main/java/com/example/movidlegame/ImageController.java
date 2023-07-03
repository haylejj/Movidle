package com.example.movidlegame;

import javafx.scene.control.Button;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ImageController {
    private String id;
    private String url;
    public static List<ImageController> listImage;

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public ImageController(String id, String title) {
        this.id = id;
        this.url = title;
    }
    @Override
    public String toString() {
        return id + " " + url;
    }
    public static List<ImageController> readImageCsvFile(){
        listImage = new ArrayList<>();
        String[] arrayImage;
        String line="";
        String regex=";";
        try{
            BufferedReader reader=new BufferedReader(new FileReader("imdbLists\\imdb_top_250_images.csv"));
            while ((line=reader.readLine())!=null){
                arrayImage = line.split(regex);
                addImageToList(listImage,arrayImage);
            }
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
        return listImage;
    }
    public static void addImageToList(List<ImageController> listImage, String[] data){
        listImage.add(new ImageController(data[0].trim(),data[1].trim()));
    }
    public static String displayImage(String id){
        return listImage.get(Integer.parseInt(id)).getUrl();
    }
    public static void displayArrow(Movie selectMovie, Movie guessMovie, Button button){
        if (Integer.parseInt(guessMovie.getYear()) < Integer.parseInt(selectMovie.getYear())){
            button.setStyle("-fx-background-image: url(https://cdn.pixabay.com/photo/2016/09/05/10/50/app-1646212_1280.png);-fx-background-color: red; -fx-background-repeat: no-repeat; -fx-background-size: 20px; -fx-background-position: right;");
        }
        else if(Integer.parseInt(selectMovie.getYear()) < Integer.parseInt(guessMovie.getYear())){
            button.setStyle("-fx-background-image: url(https://cdn.pixabay.com/photo/2016/09/05/10/50/app-1646211_1280.png);-fx-background-color: red; -fx-background-repeat: no-repeat; -fx-background-size: 20px; -fx-background-position: right;");
        }
        else{
            button.setStyle("-fx-background-color: green;");
        }
    }
}
