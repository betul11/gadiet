package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
import sample.database.CSVReader;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main extends Application {

    TextField age = null;
    TextField gender = null;
    TextField weight = null;
    RadioButton isPregnant = null;
    RadioButton isVegetarian = null;




    @Override
    public void start(Stage primaryStage) throws Exception{
        CSVReader csvReader = new CSVReader();
        csvReader.CSVReaderMethod();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Gadiet");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) throws FileNotFoundException {
        launch(args);

    }
}
