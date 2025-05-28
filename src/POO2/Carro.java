package POO2;

public class Carro {
    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void ligar() {
        System.out.println("o carro está ligado");
        conferindocambio();
        conferindoCombustivel();
        // encapsulamento
    }

    private void conferindoCombustivel() {
        System.out.println("Conferidno combustível");
    }

    private void conferindocambio() {
        System.out.println("conferindo cambio");
    }


}
