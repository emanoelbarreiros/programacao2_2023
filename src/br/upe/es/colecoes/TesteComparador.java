package br.upe.es.colecoes;

import br.upe.es.interfaces.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TesteComparador {

    public static void main(String[] args) {
        Usuario u1 = new Usuario(10);
        Usuario u2 = new Usuario(8);
        Usuario u3 = new Usuario(2);
        Usuario u4 = new Usuario(4);
        Usuario u5 = new Usuario(1);

        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        usuarios.add(u5);

        for (Usuario u : usuarios) {
            System.out.println(u);
        }

        Collections.sort(usuarios, new ComparadorUsuario());

        System.out.println();
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }
}
