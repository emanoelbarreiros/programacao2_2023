import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i = 0;
        for (;;) {
            if (i >= 10) {
                break;
            }
            System.out.println(i);
            i++;
        }

        for (int j = 0; j < 10; j++) {
            System.out.println(i);
        }

        int k = 0;
        while (k < 10) {
            System.out.println(k);
            k++;
        }

        i = 20;
        do {
            System.out.println(i);
        } while (i < 10);
    }

}