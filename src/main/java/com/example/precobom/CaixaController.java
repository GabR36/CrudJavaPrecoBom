package com.example.precobom;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class CaixaController {
    @FXML
    private TextField textCodigo;

    @FXML
    private TextField textQuantidade;

    @FXML
    private TextField textValorPg;

    @FXML
    private Label labelInfoProdutos;

    @FXML
    private Label labelTroco;

    @FXML
    private ListView listViewProdutos;

    @FXML
    private Label labelTotal;

    private float totalTotal;

    private ObservableList<String> items = FXCollections.observableArrayList();

    @FXML
    protected void onCodigoTextKeyTyped(){
        String codigo = textCodigo.getText();
        ListaProdutos listaprod = ListaProdutos.getInstace();
        String desc = listaprod.obterDescPorCodigo(codigo);
        String preco = listaprod.obterPrecoPorCodigo(codigo);
        labelInfoProdutos.setText(desc + " - R$ " + preco);
    }

    @FXML
    protected void onAdicionarMouseClicked(){
        ListaProdutos listaprod = ListaProdutos.getInstace();
        String codigo = textCodigo.getText();
        String quant = textQuantidade.getText();
        String desc = listaprod.obterDescPorCodigo(codigo);
        String preco = listaprod.obterPrecoPorCodigo(codigo);
        String total = Float.toString(Float.parseFloat(quant) * Float.parseFloat(preco));
        totalTotal += Float.parseFloat(total);
        items.add(desc + " - Qtd: " + quant + " - Unit: R$ " + preco + " - Total: R$ " + total);
        listViewProdutos.setItems(items);
        labelTotal.setText("R$ " + Float.toString(totalTotal));
    }

    @FXML
    protected void onExcluirMouseClicked(){

    }

    @FXML
    protected void onTrocoKeyTyped(){
        float valorPg = Float.parseFloat(textValorPg.getText());
        String troco = Float.toString(valorPg - totalTotal);
        labelTroco.setText("R$ " + troco);
    }
}
