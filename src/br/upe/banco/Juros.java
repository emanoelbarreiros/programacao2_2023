package br.upe.banco;

import java.util.Scanner;

public class Juros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o capital a ser investido: ");
        double capital = scan.nextDouble();

        System.out.print("Informe a taxa: ");
        double taxa = scan.nextDouble();

        System.out.print("Informe o tempo: ");
        int tempo = scan.nextInt();

        double montante = capital;

        int controle = 0;
        while (controle < tempo) {
            montante *= (1 + taxa);
            controle++;
        }
    }
}
