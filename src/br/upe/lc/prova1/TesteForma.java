package br.upe.lc.prova1;

public class TesteForma {
    public static void main(String[] args) {
        Forma[] formas = new Forma[6];
        formas[0] = new Circulo(4);
        formas[1] = new Quadrado(3);
        formas[2] = new Triangulo(3, 6);
        formas[3] = new Cubo(5);
        formas[4] = new Esfera(3);
        formas[5] = new Piramide(3, 6, 10, 3);

        StringBuilder builder = null;
        for (Forma f : formas) {
            builder = new StringBuilder();
            builder.append(f.toString());
            builder.append(" - Área: ");
            builder.append(f.getArea());
            if (f instanceof Forma3D) {
                builder.append(", Volume: ");
                builder.append(((Forma3D) f).getVolume());
            }

            System.out.println(builder.toString());
        }
    }
}
