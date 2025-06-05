package ExercicosJava;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner hl = new Scanner(System.in);
        System.out.print("Informe o valor do sálario mínimo: ");
        double salarioMinimo = hl.nextDouble();
        System.out.print("Informe o valor do sálario do usuário: ");
        double salarioDoUsuário = hl.nextDouble();
        double qtdSalarioMinimos = Math.floor(salarioDoUsuário/salarioMinimo);
        System.out.println("ESSE USUÁRIO RECEBE APROXIMADAMENTE "+qtdSalarioMinimos+ " SÁLARIOS MÍNIMOS");

    }
}
