package br.upe.teste;

import br.upe.animal.Simulacao;
import br.upe.banco.Conta;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        boolean naoDeuCerto = true;
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = 0;
        do {
            try {
                y = scan.nextInt();
                int z = x / y;
                System.out.println(z);
                naoDeuCerto = false;
            } catch(ArithmeticException e) {
                System.out.println("Não pode dividir por zero. Informe outro numero.");
            }
        } while (naoDeuCerto);

    }

    public void printf(String formato, Object... params) {

    }

    public static double media(double... valores) {
        double soma = 0;
        for (double v : valores) {
            soma += v;
        }

        return soma / valores.length;
    }

    public static void explodir() {
        int x = 10;
        int y = 2;
        int z = x / y;
        throw new EnderecoObrigatorioException();
    }

}
