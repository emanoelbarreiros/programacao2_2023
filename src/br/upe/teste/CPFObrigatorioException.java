package br.upe.teste;

public class CPFObrigatorioException extends Exception {

    public CPFObrigatorioException() {
        super("Cpf é um campo obrigatório.");
    }

}
