package ConceitosPOO;

public class Autodromo {
    public static void main(String[] args) {
        Carro civic = new Carro();
        civic.ligar();
        civic.setChassi("234554");
        System.out.println(civic.getChassi());
        Moto cb = new Moto();
        cb.ligar();
    }
}
