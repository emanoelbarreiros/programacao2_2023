package br.upe.pessoa;

import java.util.Objects;

public class Pessoa {

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public boolean equals(Object outro) {
        return this.nome.equals(((Pessoa) outro).getNome());
    }

    @Override
    public int hashCode() {
        return 20;
    }

    public String toString() {
        return this.nome;
    }

    public String getNome() {
        return this.nome;
    }

}
