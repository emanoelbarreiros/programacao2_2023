package br.upe.es.colecoes;

import br.upe.es.interfaces.Usuario;

import java.util.Comparator;

public class ComparadorUsuario implements Comparator<Usuario> {
    @Override
    public int compare(Usuario o1, Usuario o2) {
        return o1.getIdade() - o2.getIdade();
    }
}
