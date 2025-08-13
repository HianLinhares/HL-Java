package ExerciciosJava.Exercicio03.Resolucao;

import java.util.Objects;

public  abstract  class Produto {
    protected String nome;
    protected float preco;
    protected int qtdEstoque;

    public Produto(int qtdEstoque, float preco, String nome) {
        this.qtdEstoque = qtdEstoque;
        this.preco = preco;
        this.nome = nome;
    }

    protected Produto() {
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qtdEstoque=" + qtdEstoque +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    abstract void exibirInformacoes();
}
