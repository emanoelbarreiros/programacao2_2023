package br.upe.beecrowd;

import java.util.Scanner;

public class Q1131 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vitoriasInter = 0;
        int vitoriasGremio = 0;
        int empates = 0;
        String opcao = null;
        String[] placar = null;
        int golsInter = 0;
        int golsGremio = 0;

        do {
            placar = scan.nextLine().split(" ");
            golsInter = Integer.parseInt(placar[0]);
            golsGremio = Integer.parseInt(placar[1]);

            if (golsInter > golsGremio) {
                vitoriasInter++;
            } else if (golsGremio > golsInter) {
                vitoriasGremio++;
            } else {
                empates++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            opcao = scan.nextLine();
        } while(opcao.equals("1"));

        System.out.println(vitoriasGremio + vitoriasInter + empates + " grenais");
        System.out.println("Inter:" + vitoriasInter);
        System.out.println("Gremio:" + vitoriasGremio);
        System.out.println("Empates:" + empates);

        if (vitoriasInter > vitoriasGremio) {
            System.out.println("Inter venceu mais");
        } else if (vitoriasGremio > vitoriasInter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }
    }
}
