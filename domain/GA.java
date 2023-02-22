package com.nibsantoantonio.senib.domain;

public enum GA {

    Adriano("Adriano e Mari"),
    Augusto("Augusto e Nivea"),
    Carlos("Carlos e Anatach"),
    Claudio("Cláudio e Iracy"),
    Marcelo("Marcelo e Francy"),
    Jessé("Jessé e Viviane"),
    Márcio("Márcio e Gisele");
    private String nome;

    GA(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
