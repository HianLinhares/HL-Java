package ExerciciosJava.Exercicio02.Resolucao;

import java.util.Random;
import java.util.Scanner;

public class Cliente extends Pessoa{
    Scanner hl = new Scanner(System.in);
    Random r = new Random();
    protected int idCliente;
    protected int quantidadeDeLivrosEmprestados;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getQuantidadeDeLivrosEmprestados() {
        return quantidadeDeLivrosEmprestados;
    }

    public void setQuantidadeDeLivrosEmprestados(int quantidadeDeLivrosEmprestados) {
        this.quantidadeDeLivrosEmprestados = quantidadeDeLivrosEmprestados;
    }

    public Cliente cadastrarClientes(){
        Cliente novoCliente = new Cliente();
        novoCliente.setIdCliente(r.nextInt(1000));
        novoCliente.setQuantidadeDeLivrosEmprestados(0);
        System.out.print("INFORME O NOME DO CLIENTE: ");
        novoCliente.setNome(hl.nextLine());
        System.out.print("INFORME O CPF DO CLIENTE: ");
        novoCliente.setCpf(hl.nextLine());
        System.out.print("INFORME O EMAIL DO CLIENTE: ");
        novoCliente.setEmail(hl.nextLine());
        return novoCliente;
    }

    @Override
    public String toString() {
        return "ID: " + getIdCliente() + "\n" +
                "Nome: " + getNome() + "\n" +
                "CPF: " + getCpf() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Livros emprestados: " + getQuantidadeDeLivrosEmprestados();
    }



}
