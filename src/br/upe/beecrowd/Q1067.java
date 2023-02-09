package br.upe.beecrowd;

import java.util.Scanner;

public class Q1067 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor = scan.nextInt();

        for (int i = 1; i <= valor; i+=2) {
            System.out.println(i);
        }
    }
}
