package br.upe.lc.colecoes;

import br.upe.lc.interfaces.Usuario;

import java.util.Comparator;

public class UsuarioComparator implements Comparator<Usuario> {

    public int compare(Usuario u1, Usuario u2) {
        return u1.getIdade() - u2.getIdade();
    }


}
