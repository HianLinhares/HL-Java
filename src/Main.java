import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner hl = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Olá");
        System.out.println();
        System.out.print("Por favor digite o número da agência: ");
        agencia = hl.next();
        System.out.print("Por favor digite o número da conta: ");
        numero = hl.nextInt();
        System.out.print("Por favor digite o Nome do cliente: ");
        nomeCliente = hl.next();
        System.out.print("Por favor digite o saldo da conta: ");
        saldo = hl.nextFloat();


        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponivel para saque");

    }

}
