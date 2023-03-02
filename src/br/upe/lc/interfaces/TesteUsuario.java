package br.upe.lc.interfaces;

import java.util.ArrayList;
import java.util.Collections;

public class TesteUsuario {

    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        usuarios.add(new Usuario(10));
        usuarios.add(new Usuario(0));
        usuarios.add(new Usuario(2));
        usuarios.add(new Usuario(8));
        usuarios.add(new Usuario(4));
        usuarios.add(new Usuario(2));

        for(Usuario u : usuarios) {
            System.out.println(u.getIdade());
        }

        System.out.println();

        Collections.sort(usuarios);

        for(Usuario u : usuarios) {
            System.out.println(u.getIdade());
        }
    }
}
