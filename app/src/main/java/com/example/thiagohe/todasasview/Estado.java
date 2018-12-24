package com.example.thiagohe.todasasview;

//Classe usada na ViewSpiner, para servir de item no arrayAdapter.

public class Estado {

    private String nome;
    private String sigla;
    private int idFigura; //Vai servir para guardar o id( INT ) da figura posta do dir drawable.

    public Estado(String nome, String sigla, int idFigura) {
        this.nome = nome;
        this.sigla = sigla;
        this.idFigura = idFigura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }


    public int getIdFigura() { return idFigura; }
    public void setIdFigura(int idFigura) { this.idFigura = idFigura; }



    //to string será chamada pela spinner. Será essa string apresendata como um intem da lista.
    @Override
    public String toString() {
        return this.nome;
    }
}
