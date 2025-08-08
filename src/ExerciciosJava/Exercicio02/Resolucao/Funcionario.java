package ExerciciosJava.Exercicio02.Resolucao;

import java.util.Random;
import java.util.Scanner;

public class Funcionario extends Pessoa{
    Scanner hl = new Scanner(System.in);
    Random r = new Random();
    protected String matricula;
    protected String cargo;


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario cadastrarNovoFuncionario(){
        Funcionario novoFuncionario = new Funcionario();
        novoFuncionario.setMatricula(r.toString());
        System.out.print("INFORME O CARGO DO FUNCIONÁRIO: ");
        novoFuncionario.setCargo(hl.next());
        System.out.print("INFORME O NOME DO FUNCIONÁRIO: ");
        novoFuncionario.setNome(hl.next());
        System.out.print("INFORME O CPF DO FUNCIONÁRIO: ");
        novoFuncionario.setCpf(hl.next());
        System.out.print("INFORME O EMAIL DO FUNCIONÁRIO: ");
        novoFuncionario.setEmail(hl.next());
        return novoFuncionario;
    }

}
