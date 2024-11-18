package com.example.precobom;

public class Produto {
    private String codigo;
    private String desc;
    private Float preco;

    public Produto(String codigo, String desc, Float preco){
        this.desc = desc;
        this.codigo = codigo;
        this.preco = preco;
    }

    public String getDesc(){
        return desc;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public Float getPreco(){
        return preco;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

}
