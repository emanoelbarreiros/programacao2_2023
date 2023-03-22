package br.upe.lc.prova1;

public class Piramide extends Forma3D {

    private Triangulo base;

    private Triangulo face;
    private int altura;

    public Piramide(int baseTriangulo, int alturaTriangulo, int alturaPiramide, int alturaFace) {
        this.base = new Triangulo(baseTriangulo, alturaTriangulo);
        this.face = new Triangulo(baseTriangulo, alturaFace);
        this.altura = alturaPiramide;

    }

    @Override
    public double getVolume() {
        return base.getArea() * altura / 3.0;
    }

    @Override
    public double getArea() {
        return base.getArea() + 3 * (face.getArea());
    }

    @Override
    public String toString() {
        return "Piramide";
    }
}
