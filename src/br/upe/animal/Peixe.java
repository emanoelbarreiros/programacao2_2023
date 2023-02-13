package br.upe.animal;

public class Peixe extends Animal {

    public void mover() {
        this.setX(this.getX() + 10);
        this.setY(this.getY() + 10);
    }

    public void falar() {
        System.out.println("glup glup");
    }


}
