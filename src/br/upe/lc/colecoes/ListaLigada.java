package br.upe.lc.colecoes;

public class ListaLigada {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.inserirCabeca(10);

        lista.imprimirLista();
    }

    private Elemento primeiro;


    public void inserir(int i) {
        if (primeiro == null) {
            primeiro = new Elemento(i);
        } else {
            Elemento elemento = primeiro;
            while(elemento.getProximo() != null) {
                elemento = elemento.getProximo();
            }
            elemento.setProximo(new Elemento(i));
        }
    }

    public void inserirCabeca(int i) {
        Elemento novo = new Elemento(i);
        novo.setProximo(primeiro);
        primeiro = novo;
    }

    public void remover(int i) {

    }

    public void imprimirLista() {
        Elemento elemento = primeiro;
        while(elemento != null) {
            System.out.println(elemento.getValor());
            elemento = elemento.getProximo();
        }
    }


}
