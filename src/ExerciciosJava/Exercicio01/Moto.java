package ExerciciosJava.Exercicio01;

public class Moto extends Veiculos{
    private boolean temCarenagem;

    public Moto(String modelo, String placa, int ano, boolean temCarenagem) {
        super(modelo, placa, ano);
        this.temCarenagem = temCarenagem;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Tipo: Moto");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
        System.out.println("Tem carenagem: " + (temCarenagem ? "Sim" : "Não"));
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
        System.out.println("----------------------");
    }
}
