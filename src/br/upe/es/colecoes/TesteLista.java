package br.upe.es.colecoes;

public class TesteLista {

    public static void main(String[] args) {
        Lista l = new Lista(100);

        l.adicionar(10);
        l.adicionar(20);
        l.adicionar(30);
        l.adicionar(40);
        l.adicionar(50);
        l.adicionar(60);
        l.adicionar(60);
        l.adicionar(60);
        l.adicionar(60);
        l.adicionar(60);
        l.adicionar(60);
        l.adicionar(60);
        l.adicionar(60);
        l.adicionar(60);
        l.adicionar(60);
        l.adicionar(60);
        l.adicionar(60);
        l.adicionar(60);

        int numero = l.remover(2);
        System.out.println(numero);
    }
}
