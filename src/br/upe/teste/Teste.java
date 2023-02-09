package br.upe.teste;

import br.upe.banco.Conta;

import java.util.Arrays;

public class Teste {

    public static void main(String[] args) {
        double media1 = media(4,8);
        System.out.println(media1);
        double media2 = media(4,8, 10);
        System.out.println(media2);
        double media3 = media(4,8, 10, 12);
        System.out.println(media3);

        System.out.printf("%f", media1);
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

}
