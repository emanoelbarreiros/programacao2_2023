package br.upe.forma;

public class Forma2D extends Forma {

    private int qtdLados;

    public Forma2D() {
        super(0);
        this.qtdLados = 0;
    }

    public Forma2D(int qtdVertices, int qtdLados) {
        super(qtdVertices);
        this.qtdLados = qtdLados;
    }

    public int getQtdLados() {
        return this.qtdLados;
    }

    public void setQtdLados(int valor) {
        this.qtdLados = valor;
    }

}
