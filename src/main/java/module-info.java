module com.example.movidlegame {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;


    opens com.example.movidlegame to javafx.fxml;
    exports com.example.movidlegame;
}