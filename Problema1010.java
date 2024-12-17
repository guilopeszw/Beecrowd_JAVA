package beecrowd;

import java.util.Scanner;

public class Problema1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codePeca1 = sc.nextInt();
        int qtdPeca1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();

        int codePeca2 = sc.nextInt();
        int qtdPeca2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", (qtdPeca1 * valorPeca1 + qtdPeca2 * valorPeca2));

    }
}
