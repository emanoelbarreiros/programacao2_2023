package br.upe.lc.gui;

import javax.swing.*;

public class TesteJOP {

    public static void main(String[] args) {
        String texto1 = JOptionPane.showInputDialog("Informe o primeiro número.");
        String texto2 = JOptionPane.showInputDialog("Informe o segundo número.");

        int numero1 = Integer.parseInt(texto1);
        int numero2 = Integer.parseInt(texto2);

        int soma = numero1 + numero2;

        int opcao = JOptionPane.showConfirmDialog(null,"A soma é " + soma,"Soma dos inteiros",JOptionPane.OK_CANCEL_OPTION);
        System.out.println(opcao);

        if (opcao == JOptionPane.YES_OPTION) {

        } else if (opcao == JOptionPane.CANCEL_OPTION){

        }
    }

}
