package br.upe.lc.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoActionListener implements ActionListener {

    private String mensagem;

    public BotaoActionListener(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JOptionPane.showMessageDialog(null, mensagem + e.getSource());
    }
}
