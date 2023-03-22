package br.upe.lc.prova1;

public class Triangulo extends Forma2D {

    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return base * altura / 2.0;
    }

    @Override
    public String toString() {
        return "Triangulo";
    }
}
