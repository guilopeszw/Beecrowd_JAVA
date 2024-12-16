package beecrowd;

import java.util.Arrays;
import java.util.Scanner;

public class Problema1241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        String[] testes = new String[N];
        for (int i = 0; i < N; i++) {
            testes[i] = sc.nextLine();
        }

        for (int i = 0; i < N; i++) {
            String[] numeros = testes[i].split("\\s");
            // pra ver se tem só digitos:
            if (!numeros[0].matches("[0-9]+") || !numeros[1].matches("[0-9]+")) {
                break;
            }
            // pra ver se a primeira string termina com a outra string:
            if (numeros[0].endsWith(numeros[1])) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
        }

    }
}
