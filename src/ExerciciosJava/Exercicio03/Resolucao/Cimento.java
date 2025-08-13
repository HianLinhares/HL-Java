package ExerciciosJava.Exercicio03.Resolucao;

import java.util.Scanner;

class Cimento extends Produto {
    Scanner hl = new Scanner(System.in);
    protected double pesoSaco;

    public Cimento(int qtdEstoque, float preco, String nome) {
        super(qtdEstoque, preco, nome);
    }

    Cimento(){

    }

    public double getPesoSaco() {
        return pesoSaco;
    }

    public void setPesoSaco(double pesoSaco) {
        this.pesoSaco = pesoSaco;
    }

    @Override
    void exibirInformacoes(){
        Cimento c = new Cimento();
        System.out.println("Nome: " + c.getNome());
        System.out.println("Preço: " + c.getPreco());
        System.out.println("QTD: " + c.getQtdEstoque());
        System.out.println("Peso do saco" + c.getPesoSaco());
    }

    @Override
    public String toString() {
        return "Cimento{" +
                "pesoSaco=" + pesoSaco +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qtdEstoque=" + qtdEstoque +
                '}';
    }
}
