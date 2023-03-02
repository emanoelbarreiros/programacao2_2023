package br.upe.es.calculadora;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField txtDisplay;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton btnDividir;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton btnMultiplicar;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton btnSubtrair;
    private JButton a0Button;
    private JButton btnPonto;
    private JButton btnIgual;
    private JButton btnSomar;
    private JPanel pnlPrincipal;

    public int operando1;

    private final int MAIS = 0;
    private final int MENOS = 1;
    private final int VEZES = 2;
    private final int DIVIDIDO = 3;
    private final int SEM_OPERACAO = 4;

    private int operacao = SEM_OPERACAO;

    private boolean limparTela = false;

    public Calculadora() {
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (limparTela) {
                    txtDisplay.setText("");
                    limparTela = false;
                }
                txtDisplay.setText(txtDisplay.getText() + "7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (limparTela) {
                    txtDisplay.setText("");
                    limparTela = false;
                }
                txtDisplay.setText(txtDisplay.getText() + "8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (limparTela) {
                    txtDisplay.setText("");
                    limparTela = false;
                }
                txtDisplay.setText(txtDisplay.getText() + "9");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (limparTela) {
                    txtDisplay.setText("");
                    limparTela = false;
                }
                txtDisplay.setText(txtDisplay.getText() + "4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (limparTela) {
                    txtDisplay.setText("");
                    limparTela = false;
                }
                txtDisplay.setText(txtDisplay.getText() + "5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (limparTela) {
                    limparTela = false;
                    txtDisplay.setText("");
                }
                txtDisplay.setText(txtDisplay.getText() + "6");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (limparTela) {
                    txtDisplay.setText("");
                    limparTela = false;
                }
                txtDisplay.setText(txtDisplay.getText() + "1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (limparTela) {
                    txtDisplay.setText("");
                    limparTela = false;
                }
                txtDisplay.setText(txtDisplay.getText() + "2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (limparTela) {
                    txtDisplay.setText("");
                    limparTela = false;
                }
                txtDisplay.setText(txtDisplay.getText() + "3");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (limparTela) {
                    txtDisplay.setText("");
                    limparTela = false;
                }
                txtDisplay.setText(txtDisplay.getText() + "0");
            }
        });
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = DIVIDIDO;
                operando1 = Integer.parseInt(txtDisplay.getText());
                limparTela = true;
            }
        });
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = VEZES;
                operando1 = Integer.parseInt(txtDisplay.getText());
                limparTela = true;
            }
        });
        btnSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = MENOS;
                operando1 = Integer.parseInt(txtDisplay.getText());
                limparTela = true;
            }
        });
        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = MAIS;
                operando1 = Integer.parseInt(txtDisplay.getText());
                limparTela = true;
            }
        });
        btnIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int operando2 = Integer.parseInt(txtDisplay.getText());
                double resultado = 0;
                if (operacao == VEZES) {
                    resultado = operando1 * operando2;
                } else if (operacao == DIVIDIDO) {
                    resultado = (double) operando1 / (double) operando2;
                } else if (operacao == MENOS) {
                    resultado = operando1 - operando2;
                } else if (operacao == MAIS) {
                    resultado = operando1 + operando2;
                }

                txtDisplay.setText(String.format("%.2f", resultado));
                limparTela = true;
            }
        });
    }

    public JPanel getPnlPrincipal() {
        return pnlPrincipal;
    }
}
