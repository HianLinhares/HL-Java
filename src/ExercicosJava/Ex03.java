package ExercicosJava;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner hl = new Scanner(System.in);
        System.out.print("Informe um saldo: ");
        double saldo = hl.nextDouble();
        double saldoReajustado = saldo -(saldo*0.01);
        System.out.print("Seu saldo com o reajuste é de : "+saldoReajustado);

    }
}
