package br.upe.colecoes;

public class TesteVetorLista {

    public static void main(String[] args) {
        VetorLista vl = new VetorLista();
        vl.adicionar(3);
        vl.adicionar(8);
        vl.adicionar(5);
        vl.adicionar(7);
        vl.adicionar(9);
        vl.adicionar(10);
        int numero = vl.obterValor(0);
        System.out.println(numero);
        numero = vl.removerIndice(2);
        System.out.println(numero);
    }
}
