package br.upe.es.calculadora;

import javax.swing.*;

public class FrameCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        JFrame frame = new JFrame();

        frame.setContentPane(calc.getPnlPrincipal());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
