package beecrowd;

//Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”.
// Utilize a fórmula: MaiorAB = (a + b + a * b * s(a-b))/2

//Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário
// para chegar no resultado esperado.
//
//Entrada
//O arquivo de entrada contém três valores inteiros.
//
//Saída
//Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

import java.util.Scanner;

public class Problema1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = sc.nextInt();

        System.out.println(Math.max(a, (Math.max(b, s))) + " eh o maior");
    }
}
