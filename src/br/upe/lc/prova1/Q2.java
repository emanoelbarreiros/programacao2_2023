package br.upe.lc.prova1;


public class Q2 {

    public static boolean ehPalindromo(String palavra) {
        StringBuilder builder = new StringBuilder(palavra);
        String invertida = builder.reverse().toString();

        return invertida.equals(palavra);
    }

    public static void main(String[] args) {
        String palindromo = "abxxyxxba";
        String naoPalindromo = "abcd";

        System.out.println(ehPalindromo(palindromo));
        System.out.println(ehPalindromo(naoPalindromo));
    }

}
