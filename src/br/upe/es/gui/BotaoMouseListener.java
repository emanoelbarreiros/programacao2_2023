package br.upe.es.gui;

import java.awt.event.MouseEvent;

public class BotaoMouseListener implements java.awt.event.MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("pressionou e soltou (" + e.getX() + ", " + e.getY() + ")");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("pressionou");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("soltou");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouse sobre o botão");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouse saiu de cima do botão");
    }
}
