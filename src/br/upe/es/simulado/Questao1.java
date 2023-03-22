package br.upe.es.simulado;

import java.util.Random;

public class Questao1 {

    public static void main(String[] args) {
        Random dado = new Random();
        int valor1 = 0;
        int valor2 = 0;
        int[] contagem = new int[11];

        for (int i = 0; i < 50000; i++) {
            valor1 = dado.nextInt(6) + 1;
            valor2 = dado.nextInt(6) + 1;
            contagem[valor1 + valor2 - 2]++;
        }

        for (int i = 0; i < contagem.length; i++) {
            System.out.printf("O valor %d apareceu %d vezes\n", i + 2, contagem[i]);
        }
    }

}
