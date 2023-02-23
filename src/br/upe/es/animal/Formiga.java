package br.upe.es.animal;

public class Formiga extends Animal {

    public Formiga() {
        super(1, 10);
    }

    public String toString() {
        return "F" + super.toString();
    }
}
