package br.upe.lc.prova1;

public class Circulo extends Forma2D {

    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return "Circulo";
    }
}
