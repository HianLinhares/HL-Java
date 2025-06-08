package ExercicosJava.Logica;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
//      verificacão(1,2,3);
//      verificacãoPositivoPar();
        desafioChatGpt();
    }

    //1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
    public static void verificacão(int a, int b, int c) {
        int soma = a + b;
        if (soma > c) {
            System.out.println("A SOMA DE A+B É MAIOR QUE C ");
        } else if (soma < c) {
            System.out.println("A SOMA DE A+B É MENOR QUE C ");
        } else {
            System.out.println("A+B == C");
        }
    }

    //2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
    public static void verificacãoPositivoPar() {
        Scanner hl = new Scanner(System.in);
        System.out.print("INFORME O NÚMERO:");
        int a = hl.nextInt();
        boolean positivo = false;
        boolean par = false;

        if (a % 2 == 0) {
            par = true;
        }
        if (a > 0) {
            positivo = true;
        }
        System.out.println("STATUS SOBRE O NÚMERO:");
        System.out.println("POSITIVO: " + positivo);
        System.out.println("PAR: " + par);
    }

/*
Crie um programa em Java que:

Peça ao usuário dois números inteiros: inicial e final.

Verifique se os valores são válidos (inicial deve ser menor que final).

Imprima todos os números primos no intervalo entre inicial e final (inclusive).

Mostre a quantidade total de números primos encontrados no final da execução.

Regras:

Um número primo é aquele que só é divisível por 1 e por ele mesmo.

Você deve criar e usar uma função booleana chamada ehPrimo(int n).
*/

    public static void desafioChatGpt() {
        System.out.println("INFORME UM NÚMERO INICIAL E UM NÚMERO FINAL");
        System.out.println("OBS: O NÚMERO INICIAL DEVE SER MENOR QUE O NÚMERO FINAL");
        Scanner hl = new Scanner(System.in);
        int nInicial = hl.nextInt();
        int nFinal = hl.nextInt();
        if (nFinal > nInicial || nFinal == nInicial) {
            System.out.println("VOCÊ INFORMOU NÚMEROS INVÁLIDOS");
        }

        for (int i = nInicial; i <= nFinal; i++) {
            System.out.println(i);
        }


    }


}




































