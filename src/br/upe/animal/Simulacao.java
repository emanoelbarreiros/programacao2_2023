package br.upe.animal;

public class Simulacao {

    public static void main(String[] args) {
        Animal[] animais = new Animal[4];
        animais[0] = new Peixe();
        animais[1] = new Sapo();
        animais[2] = new Passaro();

        for (Animal anim : animais) {
            anim.atualizarStatus();
        }

        for (Animal anim : animais) {
            System.out.printf("(%.2f, %.2f)\n", anim.getX(), anim.getY());
        }

    }
}
