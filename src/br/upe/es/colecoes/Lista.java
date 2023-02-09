package br.upe.es.colecoes;

public class Lista {
    //será usado para armazenar os elementos da lista
    private int[] elementos;
    private int indice;
    private int incremento;

    public Lista() {
        elementos = new int[5];
        indice = -1;
        incremento = 5;
    }

    public Lista(int tamanho) {
        elementos = new int[tamanho];
        indice = -1;
        incremento = tamanho;
    }

    public void adicionar(int valor) {
        if (indice + 1 < elementos.length) {
            elementos[++indice] = valor;
        } else {
            int[] novoVetor = new int[elementos.length + incremento];
            //copiar todos os elementos à direita de indice para uma
            //casa à esquerda
            for (int i = 0; i < elementos.length; i++) {
                novoVetor[i] = elementos[i];
            }

            elementos = novoVetor;
            elementos[++indice] = valor;
        }

    }

    public int obterValor(int indice) {
        return elementos[indice];
    }

    public int remover(int indice) {
        //[10, 20, 30, 40, 50, 0]
        int retorno = elementos[indice];
        for (int i = indice + 1; i < elementos.length; i++) {
            elementos[i-1] = elementos[i];
        }
        elementos[elementos.length - 1] = 0;
        return retorno;
    }
}
