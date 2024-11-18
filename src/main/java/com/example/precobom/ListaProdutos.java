package com.example.precobom;

import java.util.ArrayList;

public class ListaProdutos {

    private java.util.ArrayList<Produto> list = new ArrayList<Produto>();
    private static final ListaProdutos instacia = new ListaProdutos();

    private ListaProdutos(){
        java.util.ArrayList<Produto> list = new ArrayList<Produto>();
        Produto Arroz = new Produto("30", "Arroz Tio Joao 1Kg", 11.98F);
        list.add(Arroz);
        Produto Manteiga = new Produto("50", "Manteiga", 7.98F);
        list.add(Manteiga);
        Produto Desodorante = new Produto("60", "Desodorante", 11.9F);
        list.add(Desodorante);
        this.setList(list);
    }

    public String obterDescPorCodigo(String codigo){
        String descricao = "";
        for (Produto x:list){
            if (x.getCodigo().equals(codigo)){
                descricao = x.getDesc();
            }
        }
        return descricao;
    }

    public void setList(ArrayList<Produto> list) {
        this.list = list;
    }

    public ArrayList<Produto> getList() {
        return list;
    }

    public static ListaProdutos getInstace(){
        return instacia;
    }
}
