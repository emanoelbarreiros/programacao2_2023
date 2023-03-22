package br.upe.es.prova1;

public class Questao1 {

    public static void calcularSequencia(int n) {
        //0 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6
        int total = 1;
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
            soma += i * i;
        }
        System.out.println("Elementos: " + total);
        System.out.println("Soma: " + soma);
    }

    public static void main(String[] args) {
        calcularSequencia(6);
    }
}
