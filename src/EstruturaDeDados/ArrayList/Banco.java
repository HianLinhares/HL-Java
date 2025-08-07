package EstruturaDeDados.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;


public class Banco {
    public static void main(String[] args) {
        ArrayList<Cliente> listaDeClientes = new ArrayList<>();

        // adição através de uma instância.
        Cliente c001 = new Cliente("Hian", 24, "A", "B", "C", "123");
        listaDeClientes.add(c001);

        //adição através sem a necessidade de uma instãncia.
        listaDeClientes.add(new Cliente("Hiuri", 24, "A", "B", "C", "123"));


        //adição através de um scanner
        Scanner hl = new Scanner(System.in);
        System.out.print("Informe o nome: ");
        String nome = hl.next();
        System.out.print("Informe a idade: ");
        int idade = hl.nextInt();
        System.out.print("Informe a rua: ");
        String rua = hl.next();
        System.out.print("Informe o bairro: ");
        String bairro = hl.next();
        System.out.print("Informe a cidade: ");
        String cidade = hl.next();
        System.out.print("Informe o cpf: ");
        String cpf = hl.next();
        listaDeClientes.add(new Cliente(nome,idade,rua,bairro,cidade,cpf));


        //varredura do arraylist
        for (int i = 0; i < listaDeClientes.size(); i++) {
            System.out.println((i+1)+")  "+listaDeClientes.get(i) + "\n");
        }






    }


}
