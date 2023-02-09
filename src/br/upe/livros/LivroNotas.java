package br.upe.livros;

import java.util.Scanner;

public class LivroNotas {

    private int qtdAlunos;
    private String nomeCurso;

    public LivroNotas(String curso) {
        nomeCurso = curso;
    }

    public LivroNotas(String curso, int alunos) {
        nomeCurso = curso;
        qtdAlunos = alunos;
    }

    public void setQtdAlunos(int qtd) {
        if (qtd >= 0) {
            qtdAlunos = qtd;
        } else {
            qtdAlunos = 0;
        }
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void exibirBoasVindas() {
        System.out.println("Bem-vindo ao livro de notas do curso " + nomeCurso + "!");
    }

    public void determinarMediaTurma(int quantidade) {
        Scanner scan = new Scanner(System.in);

        double nota;
        double total = 0;
        int notasVermelhas = 0;


        int controle = 0;
        while (controle < quantidade) {
            nota = scan.nextDouble();
            total += nota;

            if (nota < 7) {
                notasVermelhas += 1;
            }

            controle++;
        }
        double media = total / quantidade;

        System.out.println("Média da turma: " + media);
        System.out.println("Quantidade de notas vermelhas: " + notasVermelhas);
    }

}
