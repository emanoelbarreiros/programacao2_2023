package br.upe.es.prova1;

public class Questao4 {

    public static int determinante(int[][] matriz) {
        if (matriz.length != 2
                || matriz[0].length != 2
                || matriz[1].length != 2) {
            throw new DimensaoException();
        }

        return matriz[0][0] * matriz[1][1] - matriz[1][0] * matriz[0][1];
    }

    public static void main(String[] args) {
        int det = determinante(new int[][]{{3, 1},{2, 0}});
        System.out.println(det);
    }


}
