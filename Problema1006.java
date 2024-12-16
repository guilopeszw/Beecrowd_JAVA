package beecrowd;

import java.util.Scanner;

public class Problema1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double mediaFinal = ((2 * a) + (3 * b) + (5 * c)) / a + b + c;
        System.out.printf("MEDIA = %.1f\n", mediaFinal);
    }
}
