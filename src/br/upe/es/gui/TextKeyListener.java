package br.upe.es.gui;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TextKeyListener implements KeyListener {

    private JButton button;

    public TextKeyListener(JButton button) {
        this.button = button;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (((JTextField) e.getSource()).getText().isEmpty()) {
            button.setEnabled(false);
        } else {
            button.setEnabled(true);
        }
    }
}
