package com.example.movidlegame;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;

public class UIController {
    @FXML
    private HBox Hbox1;
    @FXML
    private HBox Hbox2;
    @FXML
    private HBox Hbox3;
    @FXML
    private HBox Hbox4;
    @FXML
    private HBox Hbox5;
    @FXML
    private Button btn00;
    @FXML
    private Button btn01;
    @FXML
    private Button btn02;
    @FXML
    private Button btn03;
    @FXML
    private Button btn04;
    @FXML
    private Button btn05;
    @FXML
    private Button btn10;
    @FXML
    private Button btn11;
    @FXML
    private Button btn12;
    @FXML
    private Button btn13;
    @FXML
    private Button btn14;
    @FXML
    private Button btn15;
    @FXML
    private Button btn20;
    @FXML
    private Button btn21;
    @FXML
    private Button btn22;
    @FXML
    private Button btn23;
    @FXML
    private Button btn24;
    @FXML
    private Button btn25;
    @FXML
    private Button btn30;
    @FXML
    private Button btn31;
    @FXML
    private Button btn32;
    @FXML
    private Button btn33;
    @FXML
    private Button btn34;
    @FXML
    private Button btn35;
    @FXML
    private Button btn40;
    @FXML
    private Button btn41;
    @FXML
    private Button btn42;
    @FXML
    private Button btn43;
    @FXML
    private Button btn44;
    @FXML
    private Button btn45;
    @FXML
    private Button btnGuess;
    @FXML
    private TextField textfield1;
    @FXML
    private ListView<String> listview1;
    @FXML
    private ImageView imageview1;
    @FXML
    void onKeyPressedTextfield(KeyEvent event) {
        final ObservableList<String> movieDatas = FXCollections.observableArrayList(
                "The Shawshank Redemption",
                "The Godfather",
                "The Godfather: Part II",
                "The Dark Knight",
                "12 Angry Men",
                "Schindler's List",
                "The Lord of the Rings: The Return of the King",
                "Pulp Fiction",
                "Il buono, il brutto, il cattivo",
                "Fight Club",
                "The Lord of the Rings: The Fellowship of the Ring",
                "Forrest Gump",
                "Star Wars: Episode V - The Empire Strikes Back",
                "Inception",
                "The Lord of the Rings: The Two Towers",
                "One Flew Over the Cuckoo's Nest",
                "Goodfellas",
                "The Matrix",
                "Shichinin no samurai",
                "Cidade de Deus",
                "Se7en",
                "Star Wars",
                "The Silence of the Lambs",
                "It's a Wonderful Life",
                "La vita è bella",
                "The Usual Suspects",
                "Sen to Chihiro no kamikakushi",
                "Saving Private Ryan",
                "Léon",
                "Spider-Man: Into the Spider-Verse",
                "The Green Mile",
                "Interstellar",
                "Psycho",
                "American History X",
                "City Lights",
                "C'era una volta il West",
                "Casablanca",
                "Modern Times",
                "The Pianist",
                "Intouchables",
                "The Departed",
                "Terminator 2: Judgment Day",
                "Back to the Future",
                "Whiplash",
                "Rear Window",
                "Raiders of the Lost Ark",
                "The Lion King ",
                "Gladiator",
                "The Prestige",
                "Apocalypse Now",
                "Memento",
                "Alien",
                "The Great Dictator",
                "Nuovo Cinema Paradiso",
                "Hotaru no haka",
                "Avengers: Infinity War",
                "Sunset Blvd.",
                "Das Leben der Anderen",
                "Dr. Strangelove or: How I Learned to Stop Worrying and Love the Bomb",
                "Paths of Glory",
                "The Shining",
                "Django Unchained",
                "WALL E",
                "Mononoke-hime",
                "Witness for the Prosecution",
                "American Beauty",
                "The Dark Knight Rises",
                "Oldeuboi",
                "Aliens",
                "Once Upon a Time in America",
                "Coco",
                "Das Boot",
                "Citizen Kane",
                "Braveheart",
                "Vertigo",
                "North by Northwest",
                "Reservoir Dogs",
                "Star Wars: Episode VI - Return of the Jedi",
                "M - Eine Stadt sucht einen Mörder",
                "Kimi no na wa.",
                "Amadeus",
                "Requiem for a Dream",
                "Dangal",
                "Taare Zameen Par",
                "Lawrence of Arabia",
                "Eternal Sunshine of the Spotless Mind",
                "A Clockwork Orange",
                "3 Idiots",
                "2001: A Space Odyssey",
                "Le fabuleux destin d'Amélie Poulain",
                "Toy Story",
                "Double Indemnity",
                "Taxi Driver",
                "Singin' in the Rain",
                "Inglourious Basterds",
                "Full Metal Jacket",
                "To Kill a Mockingbird",
                "Ladri di biciclette",
                "The Kid",
                "The Sting",
                "Good Will Hunting",
                "Toy Story 3",
                "Jagten",
                "Snatch",
                "Scarface",
                "Monty Python and the Holy Grail",
                "Per qualche dollaro in più",
                "L.A. Confidential",
                "The Apartment",
                "Metropolis",
                "Jodaeiye Nader az Simin",
                "Indiana Jones and the Last Crusade",
                "Rashômon",
                "Up",
                "All About Eve",
                "Batman Begins",
                "Yôjinbô",
                "Some Like It Hot",
                "Unforgiven",
                "Der Untergang",
                "Die Hard",
                "The Treasure of the Sierra Madre",
                "Heat",
                "Ikiru",
                "Incendies",
                "Raging Bull",
                "The Great Escape",
                "Bacheha-Ye aseman",
                "El laberinto del fauno",
                "Babam ve Oglum",
                "Chinatown",
                "The Third Man",
                "Bohemian Rhapsody",
                "Tonari no Totoro",
                "Hauru no ugoku shiro",
                "Ran",
                "Judgment at Nuremberg",
                "El secreto de sus ojos",
                "The Gold Rush",
                "The Bridge on the River Kwai",
                "A Beautiful Mind",
                "Lock, Stock and Two Smoking Barrels",
                "Casino",
                "Three Billboards Outside Ebbing, Missouri",
                "On the Waterfront",
                "Det sjunde inseglet",
                "Inside Out",
                "The Elephant Man",
                "Room",
                "The Wolf of Wall Street",
                "Mr. Smith Goes to Washington",
                "V for Vendetta",
                "Warrior",
                "Blade Runner",
                "Dial M for Murder",
                "Smultronstället",
                "The General",
                "No Country for Old Men",
                "Trainspotting",
                "There Will Be Blood",
                "The Sixth Sense",
                "Gone with the Wind",
                "The Thing",
                "Fargo",
                "Gran Torino",
                "Roma ",
                "The Deer Hunter",
                "Finding Nemo",
                "Idi i smotri",
                "The Big Lebowski",
                "Shutter Island",
                "Sherlock Jr.",
                "Kill Bill: Vol. 1",
                "Cool Hand Luke",
                "Rebecca",
                "Tôkyô monogatari",
                "Mary and Max",
                "Hacksaw Ridge",
                "Gone Girl",
                "How to Train Your Dragon",
                "Sunrise: A Song of Two Humans",
                "Relatos salvajes",
                "Jurassic Park",
                "Into the Wild",
                "Life of Brian",
                "In the Name of the Father",
                "The Truman Show",
                "The Grand Budapest Hotel",
                "Platoon",
                "Stand by Me",
                "It Happened One Night",
                "Eskiya ",
                "Network",
                "Stalker",
                "Persona",
                "Salinui chueok",
                "Ben-Hur",
                "Hotel Rwanda",
                "12 Years a Slave",
                "Million Dollar Baby",
                "La passion de Jeanne d'Arc",
                "Rush",
                "Andrey Rublev",
                "Le salaire de la peur",
                "Before Sunrise",
                "Mad Max: Fury Road",
                "Les quatre cents coups",
                "Prisoners",
                "Hachi: A Dog's Tale",
                "Spotlight",
                "Logan",
                "Rang De Basanti",
                "Amores perros",
                "The Princess Bride",
                "Catch Me If You Can",
                "Kaze no tani no Naushika",
                "Harry Potter and the Deathly Hallows: Part 2",
                "Butch Cassidy and the Sundance Kid",
                "Rocky",
                "Barry Lyndon",
                "Monsters, Inc.",
                "The Grapes of Wrath",
                "The Maltese Falcon",
                "Dead Poets Society",
                "Donnie Darko",
                "The Terminator",
                "Gandhi",
                "Les diaboliques",
                "La haine",
                "Groundhog Day",
                "The Wizard of Oz",
                "Jaws",
                "Le notti di Cabiria",
                "The Help",
                "Faa yeung nin wa",
                "Mandariinid",
                "Before Sunset",
                "Paper Moon",
                "Ah-ga-ssi",
                "Paris, Texas",
                "The Best Years of Our Lives",
                "Tenkû no shiro Rapyuta",
                "Pirates of the Caribbean: The Curse of the Black Pearl",
                "Blade Runner 2049",
                "La La Land",
                "Guardians of the Galaxy",
                "Fanny och Alexander",
                "Tsubaki Sanjûrô",
                "Gangs of Wasseypur",
                "Drishyam "
        );
        listview1.setItems(movieDatas);
        textfield1.setOnKeyReleased(e ->{
            listview1.setVisible(true);
            String input = textfield1.getText().toLowerCase();
            if(!input.isEmpty()){
                ObservableList<String> filteredWords = FXCollections.observableArrayList();

                for(String word : movieDatas){
                    if(word.toLowerCase().startsWith(input)){
                        filteredWords.add(word);
                    }
                }
                listview1.setItems(filteredWords);
            }
            else{
                listview1.setItems(movieDatas);
            }
        });
        listview1.setOnMouseClicked(p -> {
            String selectedItem = listview1.getSelectionModel().getSelectedItem();
            if(selectedItem != null){
                textfield1.setText(selectedItem);
            }
        } );
        listview1.setOnKeyReleased(x -> {
            if(x.getCode() == KeyCode.ENTER){
                String selectedItem = listview1.getSelectionModel().getSelectedItem();
                if(selectedItem != null){
                    textfield1.setText(selectedItem);
                }
            }
        });
    }
    public MovieController game = new MovieController();
    public String movie;
    public Movie guessMovie;
    static int counter = 0;
    static int counterRight = 0;
    public Movie selectMovie = null;
    public static int getCounterRight() {
        return counterRight;
    }


    @FXML
    void onClickGuess(ActionEvent event) {
        if (selectMovie == null) {
            FileController.readMovieCsvFile();
            selectMovie = game.selectMovie(); // movie listesinden film seçiyoruz.
        }
        movie = textfield1.getText(); // kullanıcıdan movie ismi aldık
        System.out.println(selectMovie);
        ImageController.readImageCsvFile();
        imageview1.setVisible(true);

        if (counterRight <5) {
            try {
                boolean isValidMovie = game.validateMovie(movie); // Kullanıcının girdiği filmi listede var mı diye kontrol ettik.
                if (isValidMovie) {
                    guessMovie = game.getGuessMovie(movie);
                    String imageUrl=ImageController.displayImage(guessMovie.getId());
                    imageview1.setImage(new Image(imageUrl)); // kullanıcının girdiği filmin posterini gösteriyoruz
                    if (guessMovie != null) {
                        if (counter == 0) {
                            ButtonController.setTextToButton(guessMovie,btn00,btn01,btn02,btn03,btn04,btn05);
                            AnimationController.hboxAnimator(Hbox1);
                            Hbox1.setVisible(true);
                            Hbox1.setStyle("-fx-border-style: solid;");
                            CompareController.compareMovie(selectMovie,guessMovie,btn00,btn01,btn02,btn03,btn04,btn05);
                            ImageController.displayArrow(selectMovie,guessMovie,btn01);
                        }
                        if (counter == 1) {
                            ButtonController.setTextToButton(guessMovie,btn10,btn11,btn12,btn13,btn14,btn15);
                            AnimationController.hboxAnimator(Hbox2);
                            Hbox2.setVisible(true);
                            Hbox2.setStyle("-fx-border-style: solid;");
                            CompareController.compareMovie(selectMovie,guessMovie,btn10,btn11,btn12,btn13,btn14,btn15);
                            ImageController.displayArrow(selectMovie,guessMovie,btn11);
                        }
                        if (counter == 2) {
                            ButtonController.setTextToButton(guessMovie,btn20,btn21,btn22,btn23,btn24,btn25);
                            AnimationController.hboxAnimator(Hbox3);
                            Hbox3.setVisible(true);
                            Hbox3.setStyle("-fx-border-style: solid;");
                            CompareController.compareMovie(selectMovie,guessMovie,btn20,btn21,btn22,btn23,btn24,btn25);
                            ImageController.displayArrow(selectMovie,guessMovie,btn21);
                        }
                        if (counter == 3) {
                            ImageController.displayArrow(selectMovie,guessMovie,btn31);
                            ButtonController.setTextToButton(guessMovie,btn30,btn31,btn32,btn33,btn34,btn35);
                            AnimationController.hboxAnimator(Hbox4);
                            Hbox4.setVisible(true);
                            Hbox4.setStyle("-fx-border-style: solid;");
                            CompareController.compareMovie(selectMovie,guessMovie,btn30,btn31,btn32,btn33,btn34,btn35);
                            ImageController.displayArrow(selectMovie,guessMovie,btn31);
                        }
                        if (counter == 4) {
                            ImageController.displayArrow(selectMovie,guessMovie,btn41);
                            ButtonController.setTextToButton(guessMovie,btn40,btn41,btn42,btn43,btn44,btn45);
                            AnimationController.hboxAnimator(Hbox5);
                            Hbox5.setVisible(true);
                            Hbox5.setStyle("-fx-border-style: solid;");
                            CompareController.compareMovie(selectMovie,guessMovie,btn40,btn41,btn42,btn43,btn44,btn45);
                            ImageController.displayArrow(selectMovie,guessMovie,btn41);
                        }
                    }
                }else {
                    counter--;
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Hata");
                    alert.setHeaderText("Geçersiz Film Adı!!!");
                    alert.showAndWait();
                }
            } catch (Exception e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Hata");
                alert.setHeaderText("GEÇERSİZ FİLM GİRDİNİZ.");
                alert.setContentText(e.getMessage());
                alert.showAndWait();
                e.printStackTrace();
            }
            if (selectMovie.equals(guessMovie)) {
                AlertController.wonAlert();
                btnGuess.setDisable(true);
            }
            if (counterRight==4 && !(selectMovie.equals(guessMovie))){
                AlertController.rightAlert();
                btnGuess.setDisable(true);
            }
        }
        counterRight++;
        counter++;
    }
    @FXML
    void onClickReset(ActionEvent event) {
        imageview1.setVisible(false);
        listview1.setVisible(false);
        btnGuess.setDisable(false);
        counter = 0;
        counterRight = 0;
        selectMovie = null;
        textfield1.clear();
        ButtonController.resetButton(btn00);
        ButtonController.resetButton(btn01);
        ButtonController.resetButton(btn02);
        ButtonController.resetButton(btn03);
        ButtonController.resetButton(btn04);
        ButtonController.resetButton(btn05);
        ButtonController.resetButton(btn10);
        ButtonController.resetButton(btn11);
        ButtonController.resetButton(btn12);
        ButtonController.resetButton(btn13);
        ButtonController.resetButton(btn14);
        ButtonController.resetButton(btn15);
        ButtonController.resetButton(btn20);
        ButtonController.resetButton(btn21);
        ButtonController.resetButton(btn22);
        ButtonController.resetButton(btn23);
        ButtonController.resetButton(btn24);
        ButtonController.resetButton(btn25);
        ButtonController.resetButton(btn30);
        ButtonController.resetButton(btn31);
        ButtonController.resetButton(btn32);
        ButtonController.resetButton(btn33);
        ButtonController.resetButton(btn34);
        ButtonController.resetButton(btn35);
        ButtonController.resetButton(btn40);
        ButtonController.resetButton(btn41);
        ButtonController.resetButton(btn42);
        ButtonController.resetButton(btn43);
        ButtonController.resetButton(btn44);
        ButtonController.resetButton(btn45);
        Hbox1.setVisible(false);
        Hbox2.setVisible(false);
        Hbox3.setVisible(false);
        Hbox4.setVisible(false);
        Hbox5.setVisible(false);
    }
}
