package beecrowd;

import java.util.Scanner;

public class Problema1176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, t;
        t = sc.nextInt();
        int n1 = 0, n2 = 1, n3 = 0;

        int[] vetor = new int[61];


        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = n3;
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            System.out.println("Fib(" + n + ") = " + vetor[n]);
        }

        sc.close();
    }
}
