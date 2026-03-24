package com.luis.gameapi.model;

public class Movie {
    
    private Long id;
    private String nome;
    private int nota;

    public Movie() {}

    public Movie(Long id, String nome, int nota) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
}