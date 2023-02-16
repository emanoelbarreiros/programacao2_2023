package br.upe.teste;

public class EnderecoObrigatorioException extends RuntimeException {

    public EnderecoObrigatorioException() {
        super("O endereco é obrigatório.");
    }

}
