package br.upe.es.interfaces;

public class Usuario implements Comparable {



    private int idade;

    public Usuario(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return String.valueOf(idade);
    }

    @Override
    public int compareTo(Object o) {
        Usuario param = (Usuario) o;
        if (this.idade < param.getIdade()) {
            return -1;
        } else if (this.idade > param.getIdade()) {
            return 1;
        } else {
            return 0;
        }
    }
}
