package br.upe.es.animal;

public class TesteAnimal {

    public static void main(String[] args) {
        Animal[] animais = new Animal[20];

        for (int i = 0; i < 5; i++) {
            animais[i] = new Peixe();
            animais[i + 5] = new Sapo();
            animais[i + 10] = new Passaro();
            animais[i + 15] = new Formiga();
        }

        while (true) {
            for (Animal animal : animais) {
                animal.mover();
            }

            for (Animal animal : animais) {
                System.out.println(animal.toString());
            }
        }
    }
}
