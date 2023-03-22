package br.upe.beecrowd;

import java.util.Scanner;

public class Q1101 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();

        int menor = Math.min(valor1, valor2);
        int maior = Math.max(valor1, valor2);

        while(valor1 > 0 && valor2 > 0) {

            for (int i = menor; i <= maior; i++) {
                System.out.print(i + " ");
            }

            int soma = (menor + maior) * (maior - menor + 1) / 2;
            System.out.printf("Sum=%d\n", soma);

            valor1 = scan.nextInt();
            valor2 = scan.nextInt();
            menor = Math.min(valor1, valor2);
            maior = Math.max(valor1, valor2);
        }
    }
}
