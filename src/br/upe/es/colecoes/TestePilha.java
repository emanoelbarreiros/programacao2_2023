package br.upe.es.colecoes;

import java.util.Collections;

public class TestePilha {

    public static void main(String[] args) {
        String texto = "Universidade";

        Pilha p = new Pilha();
        char[] caracteres = texto.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            p.push(caracteres[i]);
        }

        char[] invertido = new char[texto.length()];
        for (int i = 0; i < caracteres.length; i++) {
            invertido[i] = p.pop();
        }

        String reversa = new String(invertido);
        System.out.println(reversa);

    }

}
