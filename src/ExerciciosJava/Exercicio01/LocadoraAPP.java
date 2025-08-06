package ExerciciosJava.Exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class LocadoraAPP {
    private ArrayList<Veiculos> veiculos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LocadoraAPP app = new LocadoraAPP();
        app.menu();
    }

    public void menu() {
        int opcao;

        do {
            System.out.println("\n=== LOCADORA DE VEÍCULOS ===");
            System.out.println("1. Cadastrar novo veículo");
            System.out.println("2. Listar veículos");
            System.out.println("3. Alugar veículo");
            System.out.println("4. Devolver veículo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    cadastrarVeiculo();
                    break;
                case 2:
                    listarVeiculos();
                    break;
                case 3:
                    alugarVeiculo();
                    break;
                case 4:
                    devolverVeiculo();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private void cadastrarVeiculo() {
        System.out.println("\nTipo de veículo:");
        System.out.println("1. Carro");
        System.out.println("2. Moto");
        System.out.println("3. Caminhão");
        System.out.print("Escolha: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Placa: ");
        String placa = scanner.nextLine();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        switch (tipo) {
            case 1:
                System.out.print("Número de portas: ");
                int portas = scanner.nextInt();
                veiculos.add(new Carro(modelo, placa, ano, portas));
                break;
            case 2:
                System.out.print("Tem carenagem (true/false): ");
                boolean carenagem = scanner.nextBoolean();
                veiculos.add(new Moto(modelo, placa, ano, carenagem));
                break;
            case 3:
                System.out.print("Capacidade de carga (toneladas): ");
                double carga = scanner.nextDouble();
                veiculos.add(new Caminhao(modelo, placa, ano, carga));
                break;
            default:
                System.out.println("Tipo inválido.");
        }

        System.out.println("Veículo cadastrado com sucesso!");
    }

    private void listarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            System.out.println("\n=== Lista de Veículos ===");
            for (Veiculos v : veiculos) {
                v.exibirDetalhes();
            }
        }
    }

    private void alugarVeiculo() {
        System.out.print("Digite a placa do veículo para alugar: ");
        String placa = scanner.nextLine();
        Veiculos v = buscarPorPlaca(placa);
        if (v != null) {
            v.alugar();
        } else {
            System.out.println("Veículo não encontrado.");
        }
    }

    private void devolverVeiculo() {
        System.out.print("Digite a placa do veículo para devolver: ");
        String placa = scanner.nextLine();
        Veiculos v = buscarPorPlaca(placa);
        if (v != null) {
            v.devolver();
        } else {
            System.out.println("Veículo não encontrado.");
        }
    }

    private Veiculos buscarPorPlaca(String placa) {
        for (Veiculos v : veiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                return v;
            }
        }
        return null;
    }
}
