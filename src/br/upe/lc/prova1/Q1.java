package br.upe.lc.prova1;

public class Q1 {

    public static void main(String[] args) {
        int seculo1 = calcularSeculo(1);
        int seculo2 = calcularSeculo(100);
        int seculo3 = calcularSeculo(105);

        System.out.println(seculo1);
        System.out.println(seculo2);
        System.out.println(seculo3);
    }

    public static int calcularSeculo(int ano) {
        int quociente = ano / 100;
        int resto = ano % 100;

        if (resto > 0) {
            return quociente + 1;
        } else {
            return quociente;
        }

        //return (ano / 100 + (ano % 100 > 0 ? 1 : 0));
    }

}
