package Collection.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MetodosMap {
    public static void main(String[] args) {
        Map<String, Double> carrosPopulares = new HashMap<>();
        // adicionando itens no hashmap
        carrosPopulares.put("gol", 14.4d);
        carrosPopulares.put("uno", 10.4d);
        carrosPopulares.put("corsa", 12.4d);
        carrosPopulares.put("civic", 7.4d);
        System.out.println(carrosPopulares);

        // alterando valores
        carrosPopulares.put("uno", 10.5d);
        System.out.println(carrosPopulares);

        //conferindo se a chave está no hashmap
        System.out.println(carrosPopulares.containsKey("corsa"));

        //exibindo o valor do valor da chave
        System.out.println(carrosPopulares.get("civic"));

        //não é possível navegar pelo Hashmap

        //exibindo as chaves do Hashmap
        System.out.println(carrosPopulares.keySet());

        //exibindo os valores do Hashmap
        System.out.println(carrosPopulares.values());

        //exibindo o maior valor do HashMap
        System.out.println(Collections.max(carrosPopulares.values()));

        //exibindo o menor valor do hashmap
        System.out.println(Collections.min(carrosPopulares.values()));

        //exibindo a chave de menor valor
        double consumoMenosEiciente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente;
        for (Map.Entry<String,Double> entry: carrosPopulares.entrySet()){
            if (entry.getValue().equals(consumoMenosEiciente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: "+modeloMenosEficiente);
            }
        }

        //somatorio dos valores
        double soma=0;
        for (Map.Entry<String, Double> somatorio: carrosPopulares.entrySet()){
            soma += somatorio.getValue();

        }
        System.out.printf("%.2f",soma);
        System.out.println();


        //imprimindo o nome de todas as chaves
        for (Map.Entry<String, Double> nomes: carrosPopulares.entrySet()){
            System.out.println(carrosPopulares.keySet());
            break;
        }

        //imprimindo o tamanho do hashMap
        System.out.println(carrosPopulares.size());


    }


}
