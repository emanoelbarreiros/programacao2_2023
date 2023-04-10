package br.upe.lc.colecoes;

import java.util.ArrayList;
import java.util.Collections;

public class TesteArrayList {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();

        lista.add("Universidade");
        lista.add("de");
        lista.add("Pernambuco");

        Object texto = "texto";

        String valor = lista.get(0);

        Collections.sort(lista);

        Collections.frequency(lista, "de");
    }

}
