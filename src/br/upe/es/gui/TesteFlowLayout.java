package br.upe.es.gui;

import br.upe.lc.gui.BotaoActionListener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TesteFlowLayout {
    private JPanel pnlMain;
    private JButton button1;
    private JButton button2;
    private JTextField textField1;

    public TesteFlowLayout() {
        button1.addActionListener(new BotaoActionListener2());
        //textField1.addFocusListener(new BotaoFocusListener());
        button2.addMouseListener(new BotaoMouseListener());
        textField1.addKeyListener(new TextKeyListener(button2));
        textField1.addKeyListener(new TextKeyListener(button1));
    }

    public JPanel getPnlMain() {
        return pnlMain;
    }
}
