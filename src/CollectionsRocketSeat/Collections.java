package CollectionsRocketSeat;

/*
Arrays ou coleções são estruturas de dados que consistem em itens ou elementos relacionados a um mesmo
tipo ou sub-tipo de dados

ARRAYS-> consideramos um grupo de posições reservados na memória para armazenar elementos localizados através
de um índice que se inicia com zero

COLEÇÕES-> uma relação de reunião de objetos de mesma natureza, em computação uma coleção é um conjunto de dados
geralmente do mesmo tipo que corresponde a um contexto abstrato que pode ser representado por estruturas
como Listas, Conjuntos, filas, mapas, graphos


CONJUNTOS-> é uma coleção que se destaca por garantir a excluisvidade dos elementos em um só poderaá haver um
elemento de mesmo valor ou referência com base nas regras de comparação

 */


import java.util.*;

public class Collections {
    public static void main(String[] args) {
        // arrays();
        // list();
        conjuntosSet();


    }


    public static void arrays() {
        int numeros[] = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            System.out.println(numeros[i]);
        }
    }


    public static void list() {
        List linguagens = new ArrayList();
        linguagens.add("JAVA");
        linguagens.add("JAVASCRIPT");
        linguagens.add("C");
        System.out.println("COMPRIMENTO ATUAL: " + linguagens.size());
        System.out.println("LINGUAGEM JAVA ESTA NA POSIÇÃO: " + linguagens.indexOf("JAVA"));
        System.out.println("LINGUAGEM JAVA ESTA NA POSIÇÃO: " + linguagens.get(2));

    }


    public static void conjuntosSet() {
        //Não permite adicionar elementos com o mesmo nome
        //Não permite utilizar o metodo get
        Set linguagens = new HashSet();
        linguagens.add("JAVA");
        linguagens.add("JAVA");
        linguagens.add("C");
        for (Object linguagen : linguagens) {
            System.out.println(linguagen);
        }

    }

    public static void conjuntosHashSet() {
        //Não permite adicionar elementos com o mesmo nome
        //Não permite utilizar o metodo get
        Set linguagens = new LinkedHashSet();
        linguagens.add("JAVA");
        linguagens.add("JAVA");
        linguagens.add("C");
        for (Object linguagen : linguagens) {
            System.out.println(linguagen);
        }

    }





}
