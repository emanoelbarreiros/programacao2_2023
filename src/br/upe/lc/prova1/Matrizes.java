package br.upe.lc.prova1;

import java.util.Arrays;

public class Matrizes {

    static int[][] m1 = { {1, 2},
                   {3, 4}};

    static int[][] m2 = { {5, 6},
                   {7, 8}};

    public static void main(String[] args) {
        int[][] res = soma(m1, m2);       for (int[] linha : res) {
            System.out.println(Arrays.toString(linha));
        }

    }

    public static int[][] soma(int[][] matriz1, int[][] matriz2) {
        if (matriz1.length != matriz2.length) {
            throw new ErroSomaException("Número de linhas incompatível.");
        }

        for (int[] linhaM1 : matriz1) {
            for (int[] linhaM2 : matriz2) {
                if (linhaM1.length != linhaM2.length) {
                    throw new ErroSomaException("Número de colunas incompatível. l1:"
                            + Arrays.toString(linhaM1) + " l2: " + Arrays.toString(linhaM2));
                }
            }
        }

        int[][] resultado = new int[matriz1.length][matriz1[0].length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }

}
