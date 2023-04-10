package br.upe.es.collectors;

public class Cliente {

    private Long id;
    private String nome;

    public Cliente(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
