import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        Scanner hl = new Scanner(System.in);
        try {
            System.out.print("Digite seu nome: ");
            String nome = hl.next();
            System.out.print("Digite seu sobrenome: ");
            String sobrenome = hl.next();
            System.out.print("Digite sua idade: ");
            int idade = hl.nextInt();
            System.out.print("Digite sua altura: ");
            double altura = hl.nextDouble();


            System.out.println("Olá " + nome + " " + sobrenome + " de idade "
                    + idade + " e com altura de " + altura);
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser númericos");


        }
    }
}

