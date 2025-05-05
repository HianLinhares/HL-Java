import java.security.SignatureSpi;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
//        System.out.println("Olá Hian Linhares");
//        Scanner hl = new Scanner(System.in);
//        System.out.println(somar(1,2));
//        System.out.print("digite um número:");
//        int numero = hl.nextInt();
//        System.out.println("O número digitado foi : "+numero);




        int a = 10;
        int b = 89;
        String iguais;
        if (a==b){
            iguais = "Sim";
            System.out.println(iguais);
        }else{
            iguais = "Nâo";
            System.out.println(iguais);
        }

        //OPERADOR TERNÁRIO
        String iguais2 = a+b==99 ? "iguais" : "diferentes";
        System.out.println(iguais2);

    }
    public static int somar (int numero1, int numero2){
        int soma = numero1 + numero2;
        return soma;
    }
}

 class OperadoresDeAtribuição{
    String nome = "Hian";
    int idade = 24;
    double peso = 110.89;
    char sexo = 'M';
    boolean possuiNamorada = false;
}


class OperadoresAritimeticos{
    double soma = 10.8 + 10.67;
    int subtracao = 10-7;
    int divisao = 10/2;

}

