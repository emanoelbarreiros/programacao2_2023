package br.upe.lc.colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class TesteIntStream {
    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        List<Integer> nova = Arrays.stream(valores)
//                .filter(valor -> valor % 2 != 0)
//                .map(valor -> valor * 10)
//                .sorted()
//                .collect(Collectors.toList());

        IntPredicate par = v -> v % 2 == 0;
        IntPredicate maiorQue5 = v -> v > 5;

        Long nova2 = IntStream.of(valores).filter(par.and(maiorQue5)).count();

        Integer[] valores2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String resultado = Arrays.stream(valores2).reduce("", (String x, Integer y) -> x + String.valueOf(y), (x,y) -> x + y);

        System.out.println(resultado);
    }
}
