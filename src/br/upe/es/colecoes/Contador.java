package br.upe.es.colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Contador {

    public static void main(String[] args) {
        Random rand = new Random();
        int numero = 0;

        ArrayList<Integer> numeros = new ArrayList<>(100000);

        for (int i = 0; i < 100000; i++) {
            numero = rand.nextInt(11);
            numeros.add(numero);
        }

        Map<Integer, Integer> contador = new HashMap<Integer, Integer>();
        for (int valor : numeros) {
            if (contador.containsKey(valor)) {
                contador.put(valor, contador.get(valor) + 1);
            } else {
                contador.put(valor, 1);
            }
        }

        //0 -> 456
        //1 -> 123
        //...
        //10 -> 123123
        for (int chave : contador.keySet()) {
            System.out.printf("%d -> %d\n", chave, contador.get(chave));
        }
    }
}
