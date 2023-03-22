package br.upe.es.interfaces;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutPanel extends JPanel {

    GridBagLayout layout;
    public GridBagLayoutPanel(){
        initialize();
    }
    private void initialize(){
        setPreferredSize(new Dimension(400, 150));
        layout = new GridBagLayout();
        setLayout(layout);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.fill = GridBagConstraints.BOTH;
        add(new JButton("Noroeste"), gbc);

        GridBagConstraints gbc2 = (GridBagConstraints)gbc.clone();
        gbc2.fill = GridBagConstraints.VERTICAL;
        gbc2.anchor = GridBagConstraints.NORTH;
        add(new JButton("Norte"), gbc2);

        GridBagConstraints gbc3 = (GridBagConstraints)gbc.clone();
        gbc3.anchor = GridBagConstraints.NORTHEAST;
        gbc3.gridwidth = GridBagConstraints.REMAINDER;
        add(new JButton("Nordeste"), gbc3);

        GridBagConstraints gbc4 = (GridBagConstraints)gbc.clone();
        gbc4.anchor = GridBagConstraints.WEST;
        add(new JButton("Oeste"), gbc4);

        GridBagConstraints gbc5 = (GridBagConstraints)gbc.clone();
        gbc5.anchor = GridBagConstraints.CENTER;
        add(new JButton("Centro"), gbc5);

        GridBagConstraints gbc6 = (GridBagConstraints)gbc.clone();
        gbc6.anchor = GridBagConstraints.EAST;
        gbc6.gridwidth = GridBagConstraints.REMAINDER;
        add(new JButton("Leste"), gbc6);

        GridBagConstraints gbc7 = (GridBagConstraints)gbc.clone();
        gbc7.anchor = GridBagConstraints.SOUTHWEST;
        add(new JButton("Sudoeste"), gbc7);

        GridBagConstraints gbc8 = (GridBagConstraints)gbc.clone();
        gbc8.anchor = GridBagConstraints.SOUTH;
        add(new JButton("Sul"), gbc8);

        GridBagConstraints gbc9 = (GridBagConstraints)gbc.clone();
        gbc9.anchor = GridBagConstraints.SOUTHEAST;
        gbc9.gridwidth = GridBagConstraints.REMAINDER;
        add(new JButton("Sudeste"), gbc9);
    }

}
