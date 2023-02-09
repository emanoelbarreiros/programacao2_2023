package br.upe.es.colecoes;

public class Pilha {

    //será usado para armazenar os elementos da lista
    private char[] elementos;
    private int indice;
    private int incremento;

    public Pilha() {
        elementos = new char[5];
        indice = -1;
        incremento = 5;
    }

    public Pilha(char tamanho) {
        elementos = new char[tamanho];
        indice = -1;
        incremento = tamanho;
    }

    public void push(char valor) {
        if (indice + 1 < elementos.length) {
            elementos[++indice] = valor;
        } else {
            char[] novoVetor = new char[elementos.length + incremento];
            //copiar todos os elementos à direita de indice para uma
            //casa à esquerda
            for (int i = 0; i < elementos.length; i++) {
                novoVetor[i] = elementos[i];
            }

            elementos = novoVetor;
            elementos[++indice] = valor;
        }

    }

    public char peek() {
        return elementos[indice];
    }

    public char pop() {
        return elementos[indice--];
    }
}
