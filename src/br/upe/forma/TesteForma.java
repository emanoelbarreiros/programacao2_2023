package br.upe.forma;

public class TesteForma {

    public static void main(String[] args) {
        Circulo c1 = new Circulo(10.0);
        Circulo c2 = new Circulo(10.0);

//        System.out.println(c1.getRaio());
//        System.out.println(c1.getQtdLados());
//        System.out.println(c1.getQtdVertices());

        boolean z = c1.equals(c2);
        System.out.println(z);

        System.out.println(c1);
    }
}
