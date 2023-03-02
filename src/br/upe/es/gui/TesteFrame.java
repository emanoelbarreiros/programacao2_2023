package br.upe.es.gui;


import javax.swing.*;

public class TesteFrame {

    public static void main(String[] args) {
        TesteFlowLayout pnlMain = new TesteFlowLayout();

        JFrame frame = new JFrame();
        frame.setContentPane(pnlMain.getPnlMain());
        frame.pack();
        frame.setVisible(true);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
