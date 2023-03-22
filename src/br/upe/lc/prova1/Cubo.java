package br.upe.lc.prova1;

public class Cubo extends Forma3D {

    public int lado;

    public Cubo(int lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return 6 * lado * lado;
    }

    @Override
    public double getVolume() {
        return lado * lado * lado;
    }

    @Override
    public String toString() {
        return "Cubo";
    }
}
