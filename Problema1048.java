package beecrowd;

import java.util.Scanner;

public class Problema1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        double novoSalario = 0;
        int percentual = 0;

        if (salario < 0) {
            System.out.println("Salario inválido");
            System.exit(1);
        }
        if (salario <= 400) {
            novoSalario = salario * 1.15;
            percentual = 15;
        }
        else if (salario > 400 && salario <= 800) {
            novoSalario = salario * 1.12;
            percentual = 12;
        }
        else if (salario > 800 && salario <= 1200) {
            novoSalario = salario * 1.1;
            percentual = 10;
        }
        else if (salario > 1200 && salario <= 2000) {
            novoSalario = salario * 1.07;
            percentual = 7;
        }
        else if (salario > 2000) {
            novoSalario = salario * 1.04;
            percentual = 4;
        }

        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", (novoSalario - salario));
        System.out.println("Em percentual: " + percentual + " %");
    }
}
