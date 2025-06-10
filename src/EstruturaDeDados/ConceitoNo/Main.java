package EstruturaDeDados.ConceitoNo;

public class Main {
    public static void main(String[] args) {
        No no1 = new No("Conteúdo nó 1", null);
        No no2 = new No("Conteúdo nó 2", null);
        No no3 = new No("Conteúdo nó 3", null);
        No no4 = new No("Conteúdo nó 4", null);

        no1.setProximoNo(no2);
        no2.setProximoNo(no3);
        no3.setProximoNo(no4);


        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());

        /*
        Em Java, um nó é geralmente representado como uma classe
        que contém um dado e referências para outros nós. A estrutura
        dessa classe depende da estrutura de dados em que ela será usada
        (lista, árvore, grafo etc.).
         */


    }
}
