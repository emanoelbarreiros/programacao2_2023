package br.upe.es.prova1;

public class Questao2 {

    public static String obterMaiorFrequencia(String sentenca) {
        String minusculas = sentenca.toLowerCase();
        int[] letras = new int[26];
        for (char c : minusculas.toCharArray()) {
            if (c >= 97 && c <= 122) {
                letras[c - 97] += 1;
            }
        }

        int maiorFrequencia = 0;
        String letrasMaiorFrequencia = "";
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] > maiorFrequencia) {
                letrasMaiorFrequencia = String.valueOf((char) (letras[i]));
                maiorFrequencia = letras[i];
            } else if (letras[i] == maiorFrequencia) {
                letrasMaiorFrequencia += String.valueOf((char) (letras[i]));
            }
        }

        return letrasMaiorFrequencia;
    }

    public static void main(String[] args) {
        String letras = obterMaiorFrequencia("borboleta");
        System.out.println(letras);
    }

}
