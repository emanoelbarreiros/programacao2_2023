package br.upe.lc.interfaces;

public class Usuario implements Comparable{

    private int idade;

    private String nome;

    public Usuario(int idade) {
        this.idade = idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public int compareTo(Object o) {
        return this.idade - ((Usuario) o).getIdade();
    }
}
