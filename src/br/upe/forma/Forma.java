package br.upe.forma;

public class Forma {

    private int qtdVertices;

    public Forma() {
        qtdVertices = 0;
    }

    public Forma(int qtdVertices) {
        this.qtdVertices = qtdVertices;
    }

    public int getQtdVertices() {
        return qtdVertices;
    }

    public void setQtdVertices(int valor) {
        this.qtdVertices = valor;
    }

}
