package com.example.precobom;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CaixaController {
    @FXML
    private TextField textCodigo;

    @FXML
    private Label labelInfoProdutos;

    @FXML
    protected void onCodigoTextKeyTyped(){
        ListaProdutos listaprod = ListaProdutos.getInstace();
        String desc = listaprod.obterDescPorCodigo(textCodigo.getText());
        labelInfoProdutos.setText(desc);
    }
}
