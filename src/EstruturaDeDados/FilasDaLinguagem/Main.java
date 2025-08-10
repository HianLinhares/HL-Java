package EstruturaDeDados.FilasDaLinguagem;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> queueCarros = new LinkedList<>();
        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));
        System.out.println(queueCarros.add(new Carro("Peaguet")));
        System.out.println(queueCarros);
        System.out.println(queueCarros.offer(new Carro("Ferrari"))); //Measma função do add, mas retorna false caso não consiga adicionar
        System.out.println(queueCarros);
        System.out.println(queueCarros.peek()); //Pega o primeiro elemento da fila


    }
}
