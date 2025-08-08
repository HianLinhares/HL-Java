package ExerciciosJava.Exercicio02.Resolucao;

import java.util.Scanner;

public class Livro {
    Scanner hl = new Scanner(System.in);
    protected String titulo;
    protected String autor;
    protected String isBn;
    protected boolean disponivel;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsBn() {
        return isBn;
    }

    public void setIsBn(String isBn) {
        this.isBn = isBn;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void funcionarioRealzandoEmprestimo(){
        Emprestimo e = new Emprestimo();
        e.emprestimo();
    }

    public void funcionarioRealizandoDevolucao(Cliente cliente, Livro livro){
        Emprestimo e = new Emprestimo();
        e.devolucao(cliente,livro);
    }

    public Livro cadastrodeNovosLivros(){
        Livro novoLivro = new Livro();
        novoLivro.setDisponivel(true);
        System.out.print("INFORME O NOME DO LIVRO: ");
        novoLivro.setTitulo(hl.nextLine());
        System.out.print("INFORME O NOME DO AUTOR: ");
        novoLivro.setAutor(hl.nextLine());
        System.out.print("INFORME O BN DO LIVRO: ");
        novoLivro.setIsBn(hl.nextLine());
        return novoLivro;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "disponivel=" + disponivel +
                ", isBn='" + isBn + '\'' +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
