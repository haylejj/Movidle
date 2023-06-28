package com.example.movidlegame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileController {

    public static List<Movie> listMovie;
    public static List<Movie> readMovieCsvFile(){
        listMovie = new ArrayList<>();
        String[] arrayMovie;
        String line="";
        String regex=";";
        try{
            BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\cagat\\OneDrive\\Masaüstü\\imdb_top_250.csv", StandardCharsets.ISO_8859_1));
            while ((line=reader.readLine())!=null){ // satırın sonuna kadar okur
                arrayMovie = line.split(regex);
                addMovieToList(listMovie,arrayMovie);
            }
        }
        catch(Exception exception){
            exception.printStackTrace();
        }
        return listMovie;
    }

    public static void addMovieToList(List<Movie> listMovie, String[] data){
        listMovie.add(new Movie(
                data[0].trim(),
                data[1].trim(),
                data[2].trim(),
                data[3].trim(),
                data[4].trim(),
                data[5].trim(),
                data[6].trim()));
    }
    public static Movie randomGetMovie(){
        Random random=new Random();
        int randomIndex=random.nextInt(listMovie.size());
        return listMovie.get(randomIndex);
    }

}
