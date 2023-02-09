package br.upe.livros;

import java.util.Scanner;

public class LivroNotasTeste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor a ser investido: ");
        double capital = scan.nextDouble();

        System.out.print("Informe a taxa: ");
        double taxa = scan.nextDouble();

        System.out.print("Informe o intervalo de tempo: ");
        int tempo = scan.nextInt();

        double montante = capital;
        for (int t = 0; t < tempo; t++) {
            montante *= 1 + (taxa);
        }
        System.out.println(montante);

        montante = capital;
        int t = 0;
        while(t < tempo) {
            montante *= 1 + taxa;
            t++;
        }
        System.out.println(montante);

        double nota = 10.0;

        if (nota >= 9.0) {
            System.out.println("A");
        }
        if (nota >= 8.0) {
            System.out.println("B");
        }
        if (nota >= 7.0) {
            System.out.println("C");
        }
        if (nota >= 6) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}
