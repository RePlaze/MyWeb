package com.example.webnew;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.util.Objects;

import javafx.scene.Parent;
public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load( Objects.requireNonNull( getClass().getResource( "web-UI.fxml" ) ) );
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle( "nazenov Web" );
           // stage.getIcons().add(new Image(getClass().getResourceAsStream("1233.png")));
           // stage.getIcons().add(new Image( Objects.requireNonNull( getClass().getResource( "1233.png" ) )
            // .toExternalForm()));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}