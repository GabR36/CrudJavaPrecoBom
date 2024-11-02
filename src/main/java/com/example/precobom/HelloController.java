package com.example.precobom;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloController {
    @FXML
    protected void onCaixaButtonClicked() throws IOException {
        new Caixa();
    }

    @FXML
    protected void onVerificadorButtonClicked() throws IOException {
        new Verificador();
    }

    @FXML
    protected void onSobreButtonClicked() throws IOException {
        new Sobre();
    }

    @FXML
    protected void onSairButtonClicked(){
        System.exit(0);
    }
}