package br.upe.pessoa;

import br.upe.forma.Circulo;
import br.upe.forma.Forma2D;


public class TestePessoa extends Forma2D {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos");
        Pessoa p2 = new Pessoa("João");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.equals(p2));

        Circulo c1 = new Circulo(10.0);

    }
}
