package ExerciciosJava.Exercicio03.Resolucao;

public class Tinta extends Produto {
    protected double litros;

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Tinta{" +
                "litros=" + litros +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qtdEstoque=" + qtdEstoque +
                '}';
    }

    @Override
    void exibirInformacoes() {
        Tinta t = new Tinta();
        System.out.println("Nome: " + t.getNome());
        System.out.println("Preço: " + t.getPreco());
        System.out.println("QTD: " + t.getQtdEstoque());
        System.out.println("Peso do saco" + t.getLitros());
    }

    public Tinta(int qtdEstoque, float preco, String nome, double litros) {
        super(qtdEstoque, preco, nome);
        this.litros = litros;
    }

    public Tinta() {
    }
}
