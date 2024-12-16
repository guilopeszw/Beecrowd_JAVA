package beecrowd;
import java.util.Scanner;

public class Problema1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int num = sc.nextInt();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = num;
            System.out.println("N[" + i + "] = " + num );
            num *= 2;
        }
    }
}
