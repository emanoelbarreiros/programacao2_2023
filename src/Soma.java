import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero1, numero2, soma;

        System.out.println("Informe o número 1 e o nnumero2 separados por espaco: ");
        numero1 = scan.nextInt();
        numero2 = scan.nextInt();

        soma = numero1 + numero2;

        System.out.println("Soma: " + soma);

        scan.close();

        if (numero1 < numero2) {
            System.out.println("número1 é maior");
        } else if (numero1 == numero2) {
            System.out.println("número2 e numero1 são iguais");
        } else {
            System.out.println("número2 é maior");
        }

        boolean condicao = !(numero1 < numero2);
    }

    public static int somar(int... valores) {
        int[] n = new int[] { 10, 20, 30, 40, 50 };

        int total = 0;
        for (int v = 0; v < valores.length; v++, total++) {
            total += v;
        }

        return total;
    }
}
