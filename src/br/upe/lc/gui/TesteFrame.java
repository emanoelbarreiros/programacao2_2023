package br.upe.lc.gui;

import javax.swing.*;
import java.awt.*;

public class TesteFrame {

    public static void main(String[] args) {
        TesteFlowLayout pnlMain = new TesteFlowLayout();
        JButton btnTeste = new JButton("Botão novo");
        pnlMain.getPnlMain().add(btnTeste);
        JFrame frame = new JFrame();
        frame.setContentPane(pnlMain.getPnlMain());
        frame.pack();
        frame.setVisible(true);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
