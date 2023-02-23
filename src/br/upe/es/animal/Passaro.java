package br.upe.es.animal;

import java.util.Random;

public class Passaro extends Animal {


    public Passaro() {
        super(11, 10);
    }

    public String toString() {
        return "Pa" + super.toString();
    }
}
