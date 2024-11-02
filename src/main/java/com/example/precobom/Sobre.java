package com.example.precobom;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Sobre extends Stage {
    public Sobre() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sobre-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        this.setTitle("Sobre o sistema");
        this.setScene(scene);
        this.show();
    }
}
