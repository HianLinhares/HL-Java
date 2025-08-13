package Collection.List;


import java.util.*;

//Lista
public class MetodosList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>(); //criação de uma lista usando collections
        notas.add(3d); //adicionando itens nessa lista
        notas.add(5d);
        notas.add(7d);
        notas.add(9d);
        notas.add(10d);
        notas.add(6d);
        notas.add(8d);

        System.out.println(notas); //imprimindo a lista

        System.out.println("Exibindo a posição do valor igual a 5: ("+notas.indexOf(5d)+")");//realizando uma busca do item dentro da lista e imprimindo a posição

        notas.add(4,11d); //adicionando o ‘item’ numa posição setada

        notas.set(notas.indexOf(5d),6d); //alterando um valor da lista buscando pelo ‘item’ e substituindo

        notas.set(0,0d); //alterando um valor da lista passando como parametros o indice

        System.out.println(notas.contains(10d)); //conferindo se existe o método dentro da lista

        System.out.println(notas.get(2)); // imprimindo um indice da lista

        System.out.println(Collections.min(notas)); //imprimindo o menor valor da lista
        double menorNota = notas.get(0); //imprimindo o menor valor da lista
        for (int i = 0; i <notas.size() ; i++) {
                if (notas.get(i) < menorNota){
                    menorNota = notas.get(i);
                }
        }
        System.out.println(menorNota);


        System.out.println(Collections.max(notas)); //imprimindo o maior valor da lista
        double maiorNota = notas.get(0);
        for (int i = 0; i <notas.size() ; i++) { //imprimindo o menor valor da lista
            if (notas.get(i)>maiorNota){
                maiorNota = notas.get(i);
            }
        }
        System.out.println(maiorNota);

        Double somaDosValores = 0d; //imprimindo a soma dos valores da lista
        for (int i = 0; i <notas.size() ; i++) {
            somaDosValores += notas.get(i);
        }
        System.out.println(somaDosValores);
        System.out.println(somaDosValores/notas.size()); //imprimindo a média das notas
        notas.remove(6.0d); //removendo o primeiro valor igual ao parametro passado
        notas.remove(0); //removendo pelo indice


        for (int i = 0; i <notas.size() ; i++) { // removendo todos os itens menores que 7
            if (notas.get(i)<7){
                notas.remove(i);
            }
        }
        System.out.println(notas);

        notas.clear(); //apagando toda a lista
        notas.isEmpty(); //conferindo se a lista está vazia










    }
}
