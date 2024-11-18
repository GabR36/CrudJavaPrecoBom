package com.example.precobom;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VerificadorController {
    @FXML
    private TextField textCodigo;

    @FXML
    private Label labelDescricao;

    @FXML
    private Label labelValor;

    @FXML
    protected void onCodigoKeyTyped(){
        String codigo = textCodigo.getText();
        ListaProdutos listaprod = ListaProdutos.getInstace();
        String desc = listaprod.obterDescPorCodigo(codigo);
        String preco = listaprod.obterPrecoPorCodigo(codigo);
        labelDescricao.setText(desc);
        labelValor.setText("R$ " + preco);
    }
}
