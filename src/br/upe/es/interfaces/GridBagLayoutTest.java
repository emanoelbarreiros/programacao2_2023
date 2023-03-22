package br.upe.es.interfaces;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutTest extends JFrame {
    public GridBagLayoutTest(){
        super("GridBagLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(new GridBagLayoutPanel());
        pack();
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GridBagLayoutTest().setVisible(true);
            }
        });
    }
}
