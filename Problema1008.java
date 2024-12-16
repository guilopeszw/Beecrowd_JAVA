package beecrowd;

import java.util.Scanner;

public class Problema1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFuncionario = sc.nextInt();
        int qtdHoras = sc.nextInt();
        double valorHora = sc.nextDouble();
        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", (qtdHoras * valorHora));
    }
}
