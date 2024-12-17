package beecrowd;

//Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser
// decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação
// de notas necessárias.
//
//Entrada
//O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
//
//Saída
//Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo
// fornecido. Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a
// mensagem: “Presentation Error”.

import java.util.Scanner;

public class Problema1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num);

        int notas100 = num / 100;
        num -= notas100 * 100;
        int notas50 = num / 50;
        num -= notas50 * 50;
        int notas20 = num / 20;
        num -= notas20 * 20;
        int notas10 = num / 10;
        num -= notas10 * 10;
        int notas5 = num / 5;
        num -= notas5 * 5;
        int notas2 = num / 2;
        num -= notas2 * 2;
        int notas1 = num;

        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");

    }
}
