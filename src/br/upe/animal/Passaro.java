package br.upe.animal;

public class Passaro extends Animal {

    public void mover() {
        setY(getY() + 20);
        setX(getX() + 20);
    }

    public void falar() {
        System.out.println("piu");
    }

    public void blablaba() {
        System.out.println("blablaba");
    }

}
