package br.upe.es.collectors;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ExercicioCollectors {

    public static List<Produto> listaProdutos(Produto... produtos) {
        List<Produto> lista = Arrays.asList(produtos);
        return lista;
    }

    public static void main(String[] args) {
        Cliente c1 = new Cliente(1L, "Emanoel");
        Cliente c2 = new Cliente(2L, "José");
        Cliente c3 = new Cliente(3L, "Carlos");

        Produto p1 = new Produto(1L, "Caneta", "Papelaria", 1.0);
        Produto p2 = new Produto(2L, "Lápis", "Papelaria", 0.5);
        Produto p3 = new Produto(3L, "Borracha", "Papelaria", 0.8);
        Produto p4 = new Produto(4L, "Caderno", "Papelaria", 10.0);
        Produto p5 = new Produto(5L, "Senhor dos Anéis 1", "Livro", 50.0);
        Produto p6 = new Produto(6L, "O Hobbit", "Livro", 60.0);
        Produto p7 = new Produto(7L, "Duna", "Livro", 99.0);
        Produto p8 = new Produto(8L, "Zelda Breath of the Wild", "Jogo", 299.0);
        Produto p9 = new Produto(9L, "Mario Kart 8", "Jogo", 199.0);
        Produto p10 = new Produto(10L, "Deadcells", "Jogo", 54.0);
        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);

        Pedido pd1 = new Pedido(1L,
                LocalDate.of(2023, 10, 4), c1, p1, p2, p3);
        Pedido pd2 = new Pedido(2L,
                LocalDate.of(2022, 3, 13), c1, p6, p7);
        Pedido pd3 = new Pedido(3L,
                LocalDate.of(2022, 1, 2), c2, p8, p9);
        Pedido pd4 = new Pedido(4L,
                LocalDate.of(2021, 6, 12), c2, p2, p4);
        Pedido pd5 = new Pedido(5L,
                LocalDate.of(2021, 3, 2), c3, p10, p4);
        Pedido pd6 = new Pedido(6L,
                LocalDate.of(2020, 7, 21), c3, p5, p6);
        List<Pedido> pedidos = Arrays.asList(pd1, pd2, pd3, pd4, pd5, pd6);


        //questao 1: exiba todos os produtos da categoria Jogo, com preco menor 100.0
        produtos.stream()
                .filter(p -> p.getCategoria().equals("Jogo"))
                .filter(p -> p.getPreco() < 100.0)
                .forEach(System.out::println);
        System.out.println();

        //questao 2: obtenha uma lista de pedido com produtos da categoria Papelaria
        List<Pedido> papelaria = pedidos.stream()
               .filter(p -> p.getProdutos().stream().anyMatch(prod -> prod.getCategoria().equals("Papelaria")))
               .collect(Collectors.toList());
        System.out.println(papelaria.toString());
        System.out.println();

        //questao 3: obtenha os produtos agrupados por categoria
        Map<String, List<Produto>> prodPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria));
        System.out.println(prodPorCategoria.toString());

        System.out.println();
        //questao 4: obtenha uma lista com o pedido mais recente de cada cliente
        Collection<Optional<Pedido>> ultimosPedidos = pedidos.stream()
                .collect(Collectors.groupingBy(Pedido::getCliente, Collectors.maxBy(Comparator.comparing(Pedido::getDataPedido))))
                .values();

        List<Pedido> ultimos = ultimosPedidos.stream()
                .map(op -> op.isPresent() ? op.get() : null)
                .collect(Collectors.toList());

        System.out.println(ultimos.toString());

    }

}
