package ExerciciosJava.Exercicio01;

class Caminhao extends Veiculos {
    private double capacidadeCarga;

    public Caminhao(String modelo, String placa, int ano, double capacidadeCarga) {
        super(modelo, placa, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Tipo: Caminhão");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
        System.out.println("----------------------");
    }
}
