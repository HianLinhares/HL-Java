import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
       Scanner hl = new Scanner(System.in);

       //exemplo de condicional simples
       double saldo = 26.0;
       double saldoSolicitado = 14.0;
       if (saldoSolicitado<=saldo){
           saldo = saldo - saldoSolicitado;
           System.out.println("O saldo é: "+saldo);
       }



       //exemplo de condicional composta
       int idadeHian = 9;
       if (idadeHian==70){
           System.out.println("HIAN TEM 30 ANOS");
       }else{
           System.out.println("HIAN NÂO TEM 30 ANOS");
       }
    }

}
