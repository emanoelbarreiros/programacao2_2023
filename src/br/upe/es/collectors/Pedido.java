package br.upe.es.collectors;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Pedido {

    private Long id;
    private LocalDate dataPedido;
    private List<Produto> produtos;
    private Cliente cliente;

    public Pedido(Long id, LocalDate dataPedido, Cliente cliente, Produto... produtos) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.produtos = Arrays.asList(produtos);
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", dataPedido=" + dataPedido +
                ", produtos=" + produtos +
                ", cliente=" + cliente +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
