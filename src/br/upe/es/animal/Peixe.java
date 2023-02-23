package br.upe.es.animal;

import java.util.Random;

public class Peixe extends Animal {


    public Peixe() {
        super(7, 10);
    }

    @Override
    public String toString() {
        return "Pe" + super.toString();
    }
}
