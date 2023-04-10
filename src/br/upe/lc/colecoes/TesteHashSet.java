package br.upe.lc.colecoes;

import br.upe.pessoa.Pessoa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class TesteHashSet {

    public static void receberPredicado(Predicate<Integer> p) {
        System.out.println(p.test(11));
    }

    public static void receberUnaryOperator(UnaryOperator<Integer> op) {
        System.out.println(op.apply(5));
    }

    public static void main(String[] args) {
        HashSet<Pessoa> pessoas = new HashSet<Pessoa>();

        Pessoa p1 = new Pessoa("Emanoel");
        Pessoa p2 = new Pessoa("Adson");
        Pessoa p3 = new Pessoa("Amanda");

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        System.out.println(pessoas.toString());

        Pessoa p4 = new Pessoa("Adson");

        pessoas.add(p4);

        System.out.println(p4.equals(p2));

        System.out.println(pessoas.toString());

        HashMap<String, String> hashNulo = new HashMap<>();

        hashNulo.put("abc", "xyz");
        hashNulo.put(null, "ijk");

        System.out.println(hashNulo.toString());

        System.out.println(hashNulo.get(null));

        receberPredicado(v -> v % 2 == 0);

        receberUnaryOperator(v -> v + 1);
        receberUnaryOperator(v -> v * 2);
    }
}
