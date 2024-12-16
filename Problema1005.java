package beecrowd;

import java.util.Scanner;

public class Problema1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.printf("MEDIA = %.5f\n", (((3.5 * a) + (7.5 * b))/11));

    }
}
