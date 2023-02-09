package br.upe.forma;

public class Circulo extends Forma2D {

    private double raio;

    public Circulo() {

    }

    public Circulo(double raio) {
        //super(0, 0);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public boolean equals(Object outro) {
        return this.raio == ((Circulo) outro).getRaio();
    }

    public String toString() {
        return super.toString();
        //return "Circulo de raio " + this.raio;
    }
}
