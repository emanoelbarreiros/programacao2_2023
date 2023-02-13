package br.upe.animal;

public class Sapo extends Animal {

    @Override
    public void mover() {
        setY(getY() + 1);
        setX(getX() + 1);
    }

    public void falar() {
        System.out.println("webet");
    }

}
