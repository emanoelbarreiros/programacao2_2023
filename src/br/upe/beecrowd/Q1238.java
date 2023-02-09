package br.upe.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Q1238 {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int qtdCasos = Integer.parseInt(scan.nextLine());

        String[] entradas = new String[qtdCasos];

        for (int i = 0; i < qtdCasos; i++) {
            String entrada = scan.nextLine();
            entradas[i] = entrada;
        }

        String[] resultados = new String[qtdCasos];
        for (int i = 0; i < resultados.length; i++) {
            String[] palavras = entradas[i].split(" ");
            int qtdCaracteres = Math.max(palavras[0].length(), palavras[1].length());

            String resultado = "";
            for (int j = 0; j < qtdCaracteres; j++) {

                resultado += j < palavras[0].length() ? palavras[0].charAt(j) : "";
                resultado += j < palavras[1].length() ? palavras[1].charAt(j) : "";
            }
            System.out.println(resultado);
        }
    }



}
