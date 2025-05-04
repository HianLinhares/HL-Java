import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Olá Hian Linhares");
        Scanner hl = new Scanner(System.in);
        System.out.println(somar(1,2));
        System.out.print("digite um número:");
        int numero = hl.nextInt();
        System.out.println(numero);
    }





    public static int somar (int numero1, int numero2){
        int soma = numero1 + numero2;
        return soma;
    }























}

