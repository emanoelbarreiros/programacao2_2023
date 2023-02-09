package br.upe.banco;

public class ContaTeste {

    public static void main(String[] args) {
        int dia = 4;
        switch (dia) {
            case 1:
            case 2:
            case 3:
                System.out.println("Não sei qual dia da semana é, pode ser segunda, terca, ou quarta.");
//                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }

        int[] vetor = {1,2,3,4,5};
        System.out.println(vetor[0]);
        modificarVetor(vetor);
        System.out.println(vetor[0]);
    }

    public static void modificarVetor(int[] v) {
        v = null;

    }
}
