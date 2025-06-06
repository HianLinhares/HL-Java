package ExercicosJava.Logica;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner hl = new Scanner(System.in);
        System.out.print("INFORME UM NÚMERO:");
        int numero = hl.nextInt();
        System.out.println("SEU ANTECESSOR É "+(numero-1)+ " E SEU SUCESSOR É  "+(numero+1));
    }
}
