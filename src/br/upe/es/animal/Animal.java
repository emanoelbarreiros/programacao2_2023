package br.upe.es.animal;

import java.util.Random;

public class Animal {

    private int x;
    private int y;

    private Random rand;

    private int distanciaMovimento;

    public Animal(int distanciaMovimento, int posicaoInicial) {
        setRand(new Random());
        setY(getRand().nextInt(posicaoInicial));
        setX(getRand().nextInt(posicaoInicial));
        this.distanciaMovimento = distanciaMovimento;
    }

    public void mover() {
        setX(getRand().nextInt(this.distanciaMovimento) - this.distanciaMovimento/2);
        setY(getRand().nextInt(this.distanciaMovimento) - this.distanciaMovimento/2);
    }

    public String toString() {
        return String.format("(%d, %d)", getX(), getY());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }
}
