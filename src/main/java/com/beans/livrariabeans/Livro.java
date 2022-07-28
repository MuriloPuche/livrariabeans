package com.beans.livrariabeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Livro {

    private String nome;
    private String ID;
    private String Genero;

    @Autowired
    AutorLivro autorLivro;

    public AutorLivro getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(AutorLivro autorLivro) {
        this.autorLivro = autorLivro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public void exibir() {
        System.out.println(this.nome + " - " + this.Genero + " - " + this.ID);
        autorLivro.exibirAutor();
    }
}
