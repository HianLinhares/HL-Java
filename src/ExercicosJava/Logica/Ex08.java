package ExercicosJava.Logica;

/*
Objetivo:
Escreva um programa em Java que leia uma lista de números inteiros e encontre o segundo maior número da lista.

🧩 Regras:
O programa deve permitir a entrada de pelo menos 5 números inteiros (pode ser via array fixo ou Scanner).

Ele deve identificar o maior.

Mostrar na tela o segundo maior número.
*/

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner hl = new Scanner(System.in);
        int vet[] = new int[5];
        int maiorNumero = 0;
        for (int i = 0; i < vet.length; i++) {
            System.out.println("INFORME UM NÚMERO");
            vet[i] = hl.nextInt();
        }
        for (int i = 0; i < vet.length - 1; i++) {
            maiorNumero = vet[i];
            if (maiorNumero < vet[i + 1]) {
                maiorNumero = vet[i + 1];

            }
        }
        System.out.println(maiorNumero);

    }


}
