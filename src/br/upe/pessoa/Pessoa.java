package br.upe.pessoa;

public class Pessoa {

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public boolean equals(Object outro) {
        return this.nome.equals(((Pessoa) outro).getNome());
    }

    public String toString() {
        return this.nome;
    }

    public String getNome() {
        return this.nome;
    }

}
