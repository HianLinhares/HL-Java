package ExerciciosJava.Exercicio03.Resolucao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
    List<Produto> BDProdutos = new ArrayList<>();
    static Scanner hl = new Scanner(System.in);


    public static void main(String[] args) {
        Estoque e = new Estoque();
        Produto p1 = new Produto() {
            @Override
            void exibirInformacoes() {
            }
        };

        int opcao = 0;
        for (int i = 0; ; i++) {
            System.out.println("ESCOLHA UMA DAS OPÇÕES: ");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Excluir produto");
            System.out.println("3 - Buscar produto");
            System.out.println("4 - Imprimir estoque");
            System.out.println("5 - Sair");
            System.out.println();
            opcao = hl.nextInt();
            if (opcao == 1) {
                e.adicionarProduto(p1);
            } else if (opcao == 2) {
                System.out.println("Informe o nome do Produto a ser excluido");
                e.removerProdutos(hl.next());
            } else if (opcao==3) {
                e.buscaDeProduto();
            } else if (opcao==4) {
                e.ImprimirEstoque();
            } else {
                break;
            }


        }


    }

    void adicionarProduto(Produto p) {
        System.out.print("Informe o nome do produto: ");
        p.setNome(hl.next());
        System.out.print("Informe o preço do produto: ");
        p.setPreco(hl.nextFloat());
        System.out.print("Informe a quantidade no estoque: ");
        p.setQtdEstoque(hl.nextInt());
        BDProdutos.add(p);
    }

    void removerProdutos(String nome) {
        for (int i = 0; i <BDProdutos.size() ; i++) {
            if (BDProdutos.get(i).getNome().equals(nome)){
                BDProdutos.remove(BDProdutos.get(i));
            }
        }

    }

    void buscaDeProduto() {
        System.out.println("Informe o nome do produto");
        String nome = hl.nextLine();
        for (int i = 0; i < BDProdutos.size(); i++) {
            if (nome.equals(BDProdutos.get(i).getNome())) {
                System.out.println(BDProdutos.get(i).getNome());
                System.out.println(BDProdutos.get(i).getQtdEstoque());
                System.out.println(BDProdutos.get(i).getPreco());
            } else {
                System.out.println("Produto não encontrado");
            }
        }
    }

    void ImprimirEstoque() {
        System.out.println(BDProdutos);
    }


}