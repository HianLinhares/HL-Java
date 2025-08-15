package Collection.Set;

import java.util.*;

public class MetodoSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(4d, 5d, 7d, 2d, 4d, 5d, 1d, 10d, 23d));
        System.out.println(notas);
        //exibir a posição de um valor específico (NÃO É POSSÍVEL)
        //inserir um elemento em uma posição especifica (NÃO É POSSÍVEL)
        //substituir um valor por outro (NÃO É POSSÍVEL)

        //conferindo se o valor esta no Hashset
        System.out.println(notas.contains(5d));
        //exibindo o menor valor do Hashset
        System.out.println(Collections.min(notas));
        //exibindo o maior valor do Hashset
        System.out.println(Collections.max(notas));
        //soma de todos os valores ->ChatGPT (apenas com o interator)
        //remover uma valor
        notas.remove(23d);


    }


}
