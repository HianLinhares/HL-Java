package ExerciciosJava.Exercicio02.Resolucao;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner hl = new Scanner(System.in);
        Cliente c = new Cliente();
        Livro l = new Livro();
        Emprestimo e = new Emprestimo();
        ArrayList<Livro> BDlivros = new ArrayList<>();
        ArrayList<Cliente> BDclientes = new ArrayList<>();
        int escolha = 0;

        for (int i = 0; ; i++) {
            System.out.println("-------------MENU-------------");
            System.out.println("ESCOLHA UMA DAS OPÇÕES: ");
            System.out.println("1 - CADASTRAR CLIENTE");
            System.out.println("2 - CADASTRAR LIVRO");
            System.out.println("3 - REALIZAR EMPRÉSTIMO");
            System.out.println("4 - DEVOLVER LIVRO");
            System.out.println("5 - LISTAR LIVROS");
            System.out.println("6 - SAIR");
            escolha = hl.nextInt();
            if (escolha == 1) {
                BDclientes.add(c.cadastrarClientes());
                System.out.println("CLIENTE CADASTRADO");
            } else if (escolha == 2) {
                BDlivros.add(l.cadastrodeNovosLivros());
                System.out.println("LIVRO CADASTRADO");
            } else if (escolha == 3) {
                if (e.verificacaoDeemprestimoLivro(l)) {
                    e.emprestimo();
                } else {
                    System.out.println("Livro indisponível no momento");
                }
            } else if (escolha == 4) {
                e.devolucao(c, l);
            } else if (escolha == 5) {
                for (int j = 0; j < BDlivros.size(); j++) {
                    System.out.println(BDlivros.get(j));
                }
            } else if (escolha == 6){
                break;
            }

        }


    }


}
