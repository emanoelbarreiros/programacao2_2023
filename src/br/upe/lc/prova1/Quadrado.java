package br.upe.lc.prova1;

public class Quadrado extends Forma2D {

    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Quadrado";
    }
}
