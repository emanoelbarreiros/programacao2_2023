package br.upe.animal;

public abstract class Animal {

    private double x;
    private double y;
    private double passo;

    public Animal() {
        passo = 5;
    }

    public abstract void mover();

    public abstract void falar();

    public void atualizarStatus() {
        mover();
        falar();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double v) {
        x = v;
    }

    public void setY(double v) {
        y = v;
    }
}
