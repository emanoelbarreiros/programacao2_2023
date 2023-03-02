package br.upe.lc.gui;

import javax.swing.*;
import java.awt.event.*;

public class TesteFlowLayout {
    private JButton btnOK;
    private JPanel pnlMain;
    private JButton button2;
    private JButton button3;
    private JCheckBox chkTeste;

    public TesteFlowLayout() {
        btnOK.addActionListener(new BotaoActionListener("primeiro action listener"));
        btnOK.addActionListener(new BotaoActionListener("segundo action listener"));
        chkTeste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Checkbox foi clicado");
            }
        });
        chkTeste.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                JOptionPane.showMessageDialog(null, "foco no checkbox");
            }
        });
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JOptionPane.showMessageDialog(null, "mouse entrou");
            }
        });
    }

    public JPanel getPnlMain() {
        return pnlMain;
    }
}
