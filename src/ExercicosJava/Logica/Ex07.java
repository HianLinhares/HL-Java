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
        System.out.println();
        System.out.print("NÚMERO INICIAL: ");
        int nInicial = hl.nextInt();
        System.out.print("NÚMERO FINAL: ");
        int nFinal = hl.nextInt();
        int qtdPrimos = 0;
        if (nFinal < nInicial || nFinal == nInicial) {
            System.out.println("VOCÊ INFORMOU NÚMEROS INVÁLIDOS");
        }

        // Percorre do número inicial ao final e verifica se cada número é primo
        for (int i = nInicial; i <= nFinal; i++) {
            if (ehPrimo(i)) {
                qtdPrimos++;
                System.out.print(" ( "+i+" ) ");
            }
        }
        System.out.println();
        System.out.println("QUANTIDADE DE NÚMEROS PRIMOS: "+qtdPrimos);

        hl.close();
    }


    public static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}

/*

Como verificar se um número é primo?
Para saber se um número n é primo, fazemos o seguinte:

Verificamos se n é menor ou igual a 1 — se for, não é primo.

Testamos se existe algum número inteiro entre 2 e a raiz quadrada de n que divide n sem deixar resto (ou seja, n % i == 0).

Se encontrarmos algum divisor, o número não é primo.

Se não encontrarmos nenhum divisor, o número é primo.

Por que até a raiz quadrada?
Porque se um número n tem um divisor maior que sua raiz quadrada, ele também terá um divisor menor que ela.
Exemplo:
Se 36 é divisível por 9 (maior que raiz quadrada de 36 que é 6), 36 também é divisível por 4 (menor que 6). Então só faz sentido testar até a raiz quadrada.

*/










































