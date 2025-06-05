package ExercicosJava;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner hl = new Scanner(System.in);
        System.out.print("informe o valor da peça 1");
        double valorPeca1 = hl.nextDouble();
        System.out.print("informe a quantidade de peças 1");
        int qtdPeca1 = hl.nextInt();
        System.out.print("informe o valor da peça 2");
        double valorPeca2 = hl.nextDouble();
        System.out.print("informe a quatidade de peças 2");
        int qtdPeca2 = hl.nextInt();
        System.out.println("informe o valor do IPI");
        int ipi = hl.nextInt();
        double valorfinal = ((valorPeca1*qtdPeca1)+(valorPeca2*qtdPeca2)) * ((ipi/100)+1);
        System.out.println("VALOR FINAL PARA PAGAMENTO");
    }
}
