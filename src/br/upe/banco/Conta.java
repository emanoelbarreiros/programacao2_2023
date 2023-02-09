package br.upe.banco;

public class Conta {

    private double saldo;

    public Conta(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void creditar(double valor) {
        saldo += valor;
        // saldo = saldo + valor;
    }

    public void debitar(double valor) {
        saldo -= valor;
        // saldo = saldo - valor;
    }

    public double getSaldo() {
        return saldo;
    }

    //padrao de projeto singleton

}
