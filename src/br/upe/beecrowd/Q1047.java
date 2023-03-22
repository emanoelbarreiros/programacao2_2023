package br.upe.beecrowd;

import java.util.Scanner;

public class Q1047 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int horaInicial = scan.nextInt();
        int minutoInicial = scan.nextInt();
        int horaFinal = scan.nextInt();
        int minutoFinal = scan.nextInt();

        int minutosInicio = horaInicial * 60 + minutoInicial;
        int minutosFim = horaFinal * 60 + minutoFinal;

        //mesmo dia
        int duracaoMinutos = 0;
        duracaoMinutos = minutosFim - minutosInicio;

        if (minutosInicio > minutosFim) {
            duracaoMinutos += 1440;
        } else if (minutosInicio == minutosFim) {
            duracaoMinutos = 1440;
        }

        int duracaoHoras = duracaoMinutos / 60;
        int minutosRestantes = duracaoMinutos % 60;
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", duracaoHoras, minutosRestantes);
    }
}
