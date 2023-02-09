package br.upe.colecoes;

public class VetorLista {
    private int[] elementos;
    private int indice;

    private int incrementoTamanho;

    public VetorLista() {
        elementos = new int[5];
        indice = -1;
        incrementoTamanho = 5;
    }

    public VetorLista(int tamanho) {
        elementos = new int[tamanho];
        indice = -1;
        incrementoTamanho = tamanho;
    }

    public int obterValor(int indice) {
        return elementos[indice];
    }

    public void adicionar(int valor) {
        if (indice + 1 < elementos.length) {
            elementos[++indice] = valor;
        } else {
            int[] novoVetor = new int[elementos.length + incrementoTamanho];
            for (int i = 0; i < elementos.length; i++) {
                novoVetor[i] = elementos[i];
            }
            elementos = novoVetor;
            elementos[++indice] = valor;
        }
    }

    public int removerIndice(int ind) {
        int valor = elementos[ind];
        for (int i = ind; i <= indice; i++) {
            elementos[i] = elementos[i + 1];
        }
        indice--;
        return valor;
    }

}
