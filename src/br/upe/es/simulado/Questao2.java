package br.upe.es.simulado;

public class Questao2 {

    public static void main(String[] args) {
            int[] ex1 = {1,2,3,4};
            int[] ex2 = {7,8};

            int[] retorno = unirArrays(ex1, ex2);
            for (int valor : retorno) {
                System.out.println(valor);
            }
    }

    public static int[] unirArrays(int[] array1, int[] array2) {
        int[] arrayRetorno = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            arrayRetorno[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            arrayRetorno[array1.length + i] = array2[i];
        }

        return arrayRetorno;
    }

}
