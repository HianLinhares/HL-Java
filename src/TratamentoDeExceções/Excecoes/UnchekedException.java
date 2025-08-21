package TratamentoDeExceções.Excecoes;

import java.util.Scanner;


public class UnchekedException {
    public static void main(String[] args) {
        Scanner hl = new Scanner(System.in);
        boolean continueLooping = true;

        do {
            System.out.print("informe o numerador: ");
            String a = hl.next();
            System.out.print("informe o denominador: ");
            String b = hl.next();
            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                // e.printStackTrace();
                System.out.println("OS PARÂMETROS UTILIZADOS NÃO SÃO NÚMEROS");
                // e.printStackTrace();
            } catch (ArithmeticException e) {
                System.out.println("IMPOSSÍVEL DIVIDIR UM NÚMERO POR ZERO");
            } finally {
                System.out.println("chegou no finally");
            }
        } while (continueLooping);


    }


    public static int dividir(int a, int b) {
        return a / b;
    }
}


//unchecked exception: erros de lógica
//checked exception: devem ser evitados e tratados (tentar acessar um arquivo que não existe)
//Error: Não checado pelo compilador, não sendo possível tratar com try catch.

/*Resumindo com uma analogia:

Checked Exception → “Professor exige que você entregue o dever de casa”.
        (O compilador obriga você a tratar).

Unchecked Exception → “Você pode entregar errado ou nem entregar, mas vai se dar mal na hora da prova”.
        (O compilador deixa passar, mas o erro aparece em tempo de execução).*/
