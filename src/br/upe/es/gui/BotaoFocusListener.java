package br.upe.es.gui;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class BotaoFocusListener implements FocusListener {
    @Override
    public void focusGained(FocusEvent e) {
        JOptionPane.showMessageDialog(null, "ganhou foco");
    }

    @Override
    public void focusLost(FocusEvent e) {
        JOptionPane.showMessageDialog(null, "perdeu foco");
    }
}
