package br.upe.beecrowd;

import java.util.Scanner;
import java.io.IOException;


public class Q1015 {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        String linha1 = scan.nextLine();
        String linha2 = scan.nextLine();

        String[] valoresLinha1 = linha1.split(" ");
        String[] valoresLinha2 = linha2.split(" ");

        double x1 = Double.parseDouble(valoresLinha1[0]);
        double y1 = Double.parseDouble(valoresLinha1[1]);

        double x2 = Double.parseDouble(valoresLinha2[0]);
        double y2 = Double.parseDouble(valoresLinha2[1]);

        double res = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f\n", res);
    }
}
