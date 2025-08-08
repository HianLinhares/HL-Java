package ExerciciosJava.Exercicio02.Resolucao;
import java.util.Scanner;

public class Emprestimo {
    Scanner hl = new Scanner(System.in);
    protected String livro;
    protected String cliente;
    protected String dataEmprestimo;
    protected String dataDevolucao;


    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }


    public boolean verificacaoDeEmprestimoCliente(Cliente c) {
        boolean permissaoDeEmprestimo;
        if (c.getQuantidadeDeLivrosEmprestados() > 3) {
            permissaoDeEmprestimo = false;
        } else {
            permissaoDeEmprestimo = true;
        }
        return permissaoDeEmprestimo;
    }


    public boolean verificacaoDeemprestimoLivro(Livro l) {
        boolean permissaoDeEmprestimo;
        if (l.isDisponivel()) {
            permissaoDeEmprestimo = true;
        } else {
            permissaoDeEmprestimo = false;
        }
        return permissaoDeEmprestimo;
    }

    public void devolucao(Cliente c, Livro l) {
        c.setQuantidadeDeLivrosEmprestados(c.getQuantidadeDeLivrosEmprestados() - 1);
        l.setDisponivel(true);
    }

    public void emprestimo(){
        System.out.print("DIGTE O NOME DO LIVRO: ");
        setLivro(hl.next());
        System.out.print("DIGITE O NOME DO CLIENTE: ");
        setCliente(hl.next());
        System.out.print("DIGITE A DATA DO EMPRÉSTIMO: ");
        setDataEmprestimo(hl.next());
        System.out.println("DIGITE A DATA DA DEVOLUÇÃO");
        setDataDevolucao(hl.next());
    }

}
