package br.upe.lc.prova1;

public class Esfera extends Forma3D {

    public int raio;

    public Esfera(int raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * raio * raio;
    }

    @Override
    public double getVolume() {
        return 4.0 / 3.0 * Math.PI * raio * raio * raio;
    }

    @Override
    public String toString() {
        return "Esfera";
    }
}
