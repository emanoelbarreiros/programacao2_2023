package br.upe.lc.colecoes;

import br.upe.lc.interfaces.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TesteComparator {

    public static void main(String[] args) {
        Usuario u1 = new Usuario(10);
        Usuario u2 = new Usuario(2);
        Usuario u3 = new Usuario(5);
        Usuario u4 = new Usuario(1);

        ArrayList<Usuario> usuarios = new ArrayList();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);

        System.out.println(usuarios.toString());

        Collections.sort(usuarios, new UsuarioComparator());

        System.out.println(usuarios.toString());

    }
}
