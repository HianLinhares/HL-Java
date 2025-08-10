package EstruturaDeDados.EqualseHashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");
        System.out.println(carro1.hashCode());

        System.out.println(carro1.equals(carro2));

    }
}


/*
O método equals(Object obj) serve para comparar se dois objetos são logicamente iguais.
Por padrão, a implementação herdada de Object verifica se as referências são iguais (ou seja, se apontam para o mesmo objeto na memória).


O método hashCode() retorna um número inteiro que representa um “código de hash” para o objeto.
Ele é usado em estruturas de dados baseadas em hashing (como HashMap e HashSet) para localizar objetos rapidamente.


*/


