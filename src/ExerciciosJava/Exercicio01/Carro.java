package ExerciciosJava.Exercicio01;


class Carro extends Veiculos {
    private int numeroDePortas;

    public Carro(String modelo, String placa, int ano, int numeroDePortas) {
        super(modelo, placa, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Tipo: Carro");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
        System.out.println("Número de portas: " + numeroDePortas);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
        System.out.println("----------------------");
    }
}
