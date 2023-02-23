package br.upe.es.animal;

import java.util.Random;

public class Sapo extends Animal {


    public Sapo() {
        super(5, 10);
    }

    public String toString() {
        return "S" + super.toString();
    }

}
