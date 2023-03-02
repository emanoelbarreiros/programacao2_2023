package br.upe.es.interfaces;

import java.util.ArrayList;
import java.util.Collections;

public class TesteUsuario {

    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        usuarios.add(new Usuario(0));
        usuarios.add(new Usuario(4));
        usuarios.add(new Usuario(2));
        usuarios.add(new Usuario(9));
        usuarios.add(new Usuario(1));
        usuarios.add(new Usuario(6));

        for (Usuario u : usuarios) {
            System.out.println(u);
        }

        Collections.sort(usuarios);

        System.out.println();
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }
}
