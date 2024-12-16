package beecrowd;

import java.util.Scanner;

public class Problema1151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0 || n > 46) {
            System.exit(1);
        } else {
            int n1 = 0, n2 = 1, n3 = 0;
            for (int i = 0; i <= n + 1; i++) {
                if (n1 == (n - 1)) {
                    System.out.print(n1);
                } else {
                    System.out.print(n1 + " ");
                    n3 = n2 + n1;
                    n1 = n2;
                    n2 = n3;
                }
            }

        }
    }
}
